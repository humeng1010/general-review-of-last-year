package com.red;

import com.red.config.SpringConfig4;
import com.red.service.BookService;
import com.red.service.impl.BookServiceImpl4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App7 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig4.class);

//        annotationConfigApplicationContext.registerBean("bookService", BookServiceImpl4.class);

        BookService bookService = annotationConfigApplicationContext.getBean("bookService", BookService.class);
        bookService.check();

    }
}
