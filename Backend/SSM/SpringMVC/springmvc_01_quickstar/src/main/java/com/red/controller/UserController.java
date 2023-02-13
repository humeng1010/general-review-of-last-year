package com.red.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

    @RequestMapping(method = RequestMethod.GET,value = "/save")
    @ResponseBody
    public String save(){
        System.out.println("user save is running...");
        return "{'module':'springMVC save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete is running...");
        return "{'module':'springMVC delete'}";
    }
}
