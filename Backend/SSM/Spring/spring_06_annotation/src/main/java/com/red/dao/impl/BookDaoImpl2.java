package com.red.dao.impl;

import com.red.dao.BookDao;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("bookDao")
@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save2...");
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
