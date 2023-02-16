package com.red;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.red.entity.User;
import com.red.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testSelectById() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    void testSelectAll(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    void testUpdateAgeById(){
        userMapper.updateAgeById(99, 1L);
    }

    /**
     * 动态修改,不用我们自己写动态sql判断了
     */
    @Test
    void testUpdateByCondition(){
        User user = new User();
        user.setId(1L);
        user.setAge(33);
        user.setName("jack");
        int i = userMapper.updateById(user);
        System.out.println(i);

    }

    @Test
    void testSave(){
        User user = new User();
        int insert = userMapper.insert(user);
        System.out.println(insert);
//        而且还可以获取到id
        System.out.println(user.getId());

    }

    @Test
    void testDelete(){
        int i = userMapper.deleteById(1626056073490251777L);
        System.out.println(i);
    }

    @Test
    void testSelectPage(){
        IPage<User> userPage = new Page<>(2,2);
//        userPage.setCurrent(2);
//        userPage.setSize(2);//(n-1)*n
        userMapper.selectPage(userPage,null);
        List<User> users = userPage.getRecords();
        System.out.println(users);
    }

}
