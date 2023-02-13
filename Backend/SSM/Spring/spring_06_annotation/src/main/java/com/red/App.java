package com.red;


import com.red.config.SpringConfig;
import com.red.service.BookService;
import com.red.service.impl.BookServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        按照名称和类型获取
//        BookDao bookDao = annotationConfigApplicationContext.getBean("bookDao", BookDao.class);
//        按照类型获取(没有名称)
        BookService bookService = annotationConfigApplicationContext.getBean(BookService.class);
        bookService.save();
//        bookDao.save();
        annotationConfigApplicationContext.close();
    }
}
