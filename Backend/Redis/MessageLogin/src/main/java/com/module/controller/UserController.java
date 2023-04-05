package com.module.controller;

import com.module.entity.User;
import com.module.service.UserService;
import com.module.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/code")
    public Result code(@RequestBody User user){
        return userService.code(user);
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user){

        return userService.login(user);

    }

}
