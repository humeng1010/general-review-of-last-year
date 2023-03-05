package com.red;

import com.red.config.SpringConfig;
import com.red.entity.Cat;
import com.red.entity.Mouse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App4 {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

//        加载bean的第五种方式:
        annotationConfigApplicationContext.registerBean("tom", Cat.class,1);
        annotationConfigApplicationContext.registerBean("tom", Cat.class,2);
        annotationConfigApplicationContext.registerBean("tom", Cat.class,3);

        annotationConfigApplicationContext.register(Mouse.class);
        for (String beanDefinitionName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        Cat tom = annotationConfigApplicationContext.getBean("tom", Cat.class);
        System.out.println(tom);


    }
}
