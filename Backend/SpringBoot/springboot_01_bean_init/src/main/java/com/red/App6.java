package com.red;

import com.red.config.SpringConfig2;
import com.red.config.SpringConfig3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App6 {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig3.class);

        for (String beanDefinitionName : annotationConfigApplicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }


    }
}
