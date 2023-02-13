package com.red.controller;

import com.red.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class UserController {

    //响应页面
    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        return "page.jsp";
    }

    //响应文本数据
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        return "response text";
    }


    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        User user = new User();
        user.setName("张三");
        user.setAge(19);
        return user;
    }

    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setName("张三");
        user1.setAge(19);
        User user2 = new User();
        user2.setName("张三");
        user2.setAge(19);
        Collections.addAll(users,user1,user2);
        return users;
    }
}
