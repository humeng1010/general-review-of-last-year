package com.red;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.red.entity.User;
import com.red.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class WrapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    void testSelectByCondition(){
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getAge,21).orderByDesc(User::getId);
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }
    @Test
    void testSelectMapping(){
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.select(User::getName,User::getAge);
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }
}
