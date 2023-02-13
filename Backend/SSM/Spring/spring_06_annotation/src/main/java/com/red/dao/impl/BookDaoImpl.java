package com.red.dao.impl;

import com.red.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("bookDao")
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
//    @Value("简单类型用value")
//    private String name;
    @Value("${name}")
    private String name;
    @Override
    public void save() {
        System.out.println("book dao save..."+name);
    }

    @PostConstruct
    public void init(){
        System.out.println("book dao init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("book dao destroy");
    }
}
