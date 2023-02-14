package com.red.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getBook(){
        System.out.println("book");
        return "book";
    }
    @GetMapping("/{id}")
    public String getBookById(@PathVariable Integer id){
        System.out.println("获取id为:"+id+"的书");
        return "book id is"+id;
    }

}
