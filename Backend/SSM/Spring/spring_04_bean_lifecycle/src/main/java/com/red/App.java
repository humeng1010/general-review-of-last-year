package com.red;


import com.red.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = applicationContext.getBean("bookDao", BookDao.class);
        bookDao.save();
        applicationContext.close();
    }
}
