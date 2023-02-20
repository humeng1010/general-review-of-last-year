package com.red;

import com.red.entity.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Cat cat = context.getBean(Cat.class);
        System.out.println(cat);
    }
}
