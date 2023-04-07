package com.module.service.impl;

import com.module.entity.User;
import com.module.mapper.UserMapper;
import com.module.service.UserService;
import com.module.utils.RedisConstant;
import com.module.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result code(User user) {
        if (user.getAccount()==null||"".equals(user.getAccount())){
            return Result.fail("请您输入手机号");
        }

        String code = UUID.randomUUID().toString().substring(0, 4);
        log.info("验证码:{}",code);

        stringRedisTemplate.opsForValue().set(RedisConstant.CODE +user.getAccount(),code,5, TimeUnit.MINUTES);

        //send code message......

        return Result.ok("验证码发送成功,5分钟内有效,请注意查收!");
    }
    @Override
    public Result login(User user) {
        if (user==null||user.getAccount()==null||"".equals(user.getAccount())){
            return Result.fail("请输入手机号");
        }
        if (user.getPassword()==null||"".equals(user.getPassword())){
            return Result.fail("请输入验证码");
        }

        String cacheCode = stringRedisTemplate.opsForValue().get(RedisConstant.CODE + user.getAccount());
        if (cacheCode==null){
            return Result.fail("验证码过期");
        }
        if (!user.getPassword().equals(cacheCode)){
            return Result.fail("验证码错误");
        }

        User dbUser = userMapper.selectByAccount(user.getAccount());

        if (Objects.isNull(dbUser)){
            log.info("未注册,进行注册");
//            return Result.fail("进行注册");
            registerUserAccount(user.getAccount());
        }

        return Result.ok("登陆成功");
    }

    private void registerUserAccount(String account){
        User tempUser = new User();
        tempUser.setAccount(account);
        tempUser.setPassword("123456");
        userMapper.saveUser(tempUser);
    }


}
