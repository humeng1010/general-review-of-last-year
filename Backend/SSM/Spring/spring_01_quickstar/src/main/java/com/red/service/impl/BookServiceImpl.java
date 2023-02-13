package com.red.service.impl;

import com.red.dao.BookDao;
import com.red.service.BookService;

public class BookServiceImpl implements BookService {
//    private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        bookDao.save();
        System.out.println("book service save...");
    }
}
