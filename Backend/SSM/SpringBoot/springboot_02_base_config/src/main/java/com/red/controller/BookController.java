package com.red.controller;

import com.red.entity.MyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${info.name}")
    private String name;
    @Value("${info.age}")
    private Integer age;

    @Autowired
    private MyInfo myInfo;

    @Autowired
    private Environment environment;

    @GetMapping("/author")
    public String getInfo(){
        System.out.println(environment.getProperty("info.tel"));
        System.out.println(environment.getProperty("info.hobbies[0]"));
        System.out.println("============");
        System.out.println(myInfo);
        return name+"-"+age;
    }

    @GetMapping("/{id}")
    public String getBookById(@PathVariable Integer id){
        System.out.println("id => "+id);
        return "id is"+id;
    }



}
