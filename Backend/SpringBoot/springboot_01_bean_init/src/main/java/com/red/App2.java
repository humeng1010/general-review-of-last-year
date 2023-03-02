package com.red;

import com.red.config.SpringConfig;
import com.red.entity.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解注册bean
 */
public class App2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        Cat tom = applicationContext.getBean("tom", Cat.class);
        Cat tom2 = applicationContext.getBean("tom", Cat.class);
        System.out.println(tom==tom2);
    }
}
