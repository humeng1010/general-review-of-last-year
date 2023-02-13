package com.red;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.red.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookService bookService = classPathXmlApplicationContext.getBean("bookService", BookService.class);
//        bookService.save();
        DataSource dataSource = classPathXmlApplicationContext.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);
//        ComboPooledDataSource bean = classPathXmlApplicationContext.getBean(ComboPooledDataSource.class);
//        System.out.println(bean);
    }
}
