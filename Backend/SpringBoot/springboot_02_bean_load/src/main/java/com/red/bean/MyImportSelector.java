package com.red.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        try {
//            判断是否有Mouse这个类,如果有则加载Cat
            Class<?> aClass = Class.forName("com.red.bean.Mouse");
            if (aClass!=null){
                return new String[]{"com.red.bean.Cat"};
            }
        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
            return new String[0];
        }
        return null;
    }
}
