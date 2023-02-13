package com.red.dao.impl;

import com.red.dao.BookDao;

public class BookDaoImpl implements BookDao {
//    私有构造器也会被创建对象, 反射!
    private BookDaoImpl() {
        System.out.println("book dao init");
    }

    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
