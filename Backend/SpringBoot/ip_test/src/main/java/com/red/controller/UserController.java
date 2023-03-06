package com.red.controller;

import com.red.service.IpCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IpCountService ipCountService;

    @GetMapping
    public String getConcurrentUserInfo(){
        ipCountService.count();
        return "{'name':'张三'}";
    }
}
