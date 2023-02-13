package com.red;

import com.red.dao.BookDao;
import com.red.entity.Book;
import com.red.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService1 = applicationContext.getBean(BookService.class);
        bookService1.save();
        BookService bookService2 = applicationContext.getBean(BookService.class);
        System.out.println(bookService1==bookService2);//true 单例
//        book配置为prototype非单例
        Book book1 = applicationContext.getBean("book", Book.class);
        Book book2 = applicationContext.getBean("book", Book.class);
        Book book3 = applicationContext.getBean("book", Book.class);
        Book book4 = applicationContext.getBean("book", Book.class);
        /*BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        bookDao.save();*/

//        BookService bookService = applicationContext.getBean("bookService", BookService.class);
//        bookService.save();

    }
}
