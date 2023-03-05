package com.red;

import com.red.config.SpringConfig;
import com.red.config.SpringConfig2;
import com.red.entity.Cat;
import com.red.entity.Mouse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App5 {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig2.class);

        for (String beanDefinitionName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }


    }
}
