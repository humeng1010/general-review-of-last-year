package com.red.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("=========");
        System.out.println(importingClassMetadata.getClassName());
        Map<String, Object> attributes = importingClassMetadata.getAnnotationAttributes("org.springframework.context.annotation.ComponentScan");
        System.out.println(attributes);

        System.out.println("=========");
//        对bean的加载进行控制,如果有某个注解则加载某个bean
        boolean flag = importingClassMetadata.hasAnnotation("org.springframework.context.annotation.Configuration");

        if (flag){
            return new String[]{"com.red.entity.Dog"};
        }else{
            return new String[]{"com.red.entity.Cat"};
        }
    }
}
