package com.red.controller;

import com.red.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/users")
public class UserController {

    @RequestMapping(method = RequestMethod.GET,path = "/{id}")
    @ResponseBody
    public User get(@PathVariable Integer id,@RequestBody User user){
        System.out.println("get user id is "+id);
        System.out.println(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public User save(@RequestBody User user){
        System.out.println("user save..."+user);
        return user;
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("delete user id is"+id);
        return "delete user id is"+id;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("update user name is "+user.getName());
        return "update user name is "+user.getName();
    }


}
