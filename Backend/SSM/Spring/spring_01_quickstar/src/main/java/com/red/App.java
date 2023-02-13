package com.red;

import com.red.dao.impl.BookDaoImpl;
import com.red.service.BookService;
import com.red.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl(new BookDaoImpl());
        bookService.save();
    }
}
