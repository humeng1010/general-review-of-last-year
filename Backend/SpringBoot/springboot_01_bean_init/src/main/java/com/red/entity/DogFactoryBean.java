package com.red.entity;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

public class DogFactoryBean implements FactoryBean<Dog> {
    @Override
    public Dog getObject() throws Exception {
        return new Dog();
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }
}
