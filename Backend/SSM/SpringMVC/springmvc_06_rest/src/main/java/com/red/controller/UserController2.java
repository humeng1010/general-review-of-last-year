package com.red.controller;

import com.red.entity.User;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users2")
public class UserController2 {


    @GetMapping("/{id}")
    public User get(@PathVariable Integer id,@RequestBody User user){
        System.out.println("get user id is "+id);
        System.out.println(user);
        return user;
    }


    @PostMapping
    public User save(@RequestBody User user){
        System.out.println("user save..."+user);
        return user;
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("delete user id is"+id);
        return "delete user id is"+id;
    }


    @PutMapping
    public String update(@RequestBody User user){
        System.out.println("update user name is "+user.getName());
        return "update user name is "+user.getName();
    }


}
