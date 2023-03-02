package com.red;

import com.red.entity.Cat;
import com.red.entity.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;


public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*Cat cat = context.getBean(Cat.class);
        Dog dog = context.getBean(Dog.class);
        System.out.println(dog);
        System.out.println(cat);*/
        /*String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);*/
    }
}
