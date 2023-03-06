package com.red.service.impl;

import com.red.service.BookService;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Override
    public void check() {
        System.out.println("book service 1");
    }
}
