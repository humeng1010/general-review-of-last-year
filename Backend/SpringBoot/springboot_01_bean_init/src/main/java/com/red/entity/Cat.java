package com.red.entity;


public class Cat {
    private Integer age;

    public Cat() {
    }

    public Cat(Integer age){
        this.age = age;

    }
    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
