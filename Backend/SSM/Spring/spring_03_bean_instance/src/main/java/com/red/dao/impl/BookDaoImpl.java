package com.red.dao.impl;

import com.red.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("book dao init...");
    }

    @Override
    public void save() {
        System.out.println("book dao save...");
    }

}
