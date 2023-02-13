package com.red;

import com.red.config.SpringConfig;
import com.red.entity.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Book book1 = context.getBean(Book.class);
        Book book2 = context.getBean(Book.class);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1==book2);

    }
}
