package com.red;

import com.red.config.SpringConfig;
import com.red.entity.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Dog dog = annotationConfigApplicationContext.getBean("dog", Dog.class);
//        System.out.println(dog);
        for (String beanDefinitionName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        SpringConfig springConfig = annotationConfigApplicationContext.getBean("springConfig", SpringConfig.class);
        System.out.println(springConfig);

    }
}
