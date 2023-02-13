package com.red.service.impl;

import com.red.dao.BookDao;
import com.red.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component
@Service
public class BookServiceImpl implements BookService {
//    @Autowired
//    @Qualifier("bookDao")
    @Resource//这个注解是javax提供的,会按照名称注入
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }
}
