package com.red.bean;

import com.red.entity.Dog;
import com.red.service.impl.BookServiceImpl2;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
//        1.使用元数据进行判定
        boolean flag = importingClassMetadata.hasAnnotation("org.springframework.context.annotation.Configuration");
        BeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(BookServiceImpl2.class).getBeanDefinition();
//        设置bean的是否单例
        beanDefinition.setScope(ConfigurableBeanFactory.SCOPE_SINGLETON);
        if (flag){
            registry.registerBeanDefinition("bookService",beanDefinition);
        }
    }
}
