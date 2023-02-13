package com.red.dao.impl;

import com.red.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("book dao instance");
    }

    @Override
    public void save() {
        System.out.println("book dao save...");
    }

    public void init(){
        System.out.println("book dao init");
    }

    public void destroy(){
        System.out.println("book dao destroy");
    }
}
