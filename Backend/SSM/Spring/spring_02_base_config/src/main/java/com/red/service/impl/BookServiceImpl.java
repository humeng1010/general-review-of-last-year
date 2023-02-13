package com.red.service.impl;

import com.red.dao.BookDao;
import com.red.service.BookService;

public class BookServiceImpl implements BookService {
    public BookServiceImpl() {
        System.out.println("book service init");
    }

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        bookDao.save();
        System.out.println("book service save...");
    }
}
