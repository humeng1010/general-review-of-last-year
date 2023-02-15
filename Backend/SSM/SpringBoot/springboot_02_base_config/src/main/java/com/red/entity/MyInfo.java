package com.red.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
// 在启动类上使用@ConfigurationPropertiesScan("com.red.entity")扫描entity包下使用@ConfigurationProperties注解的类自动将该类注册到spring容器中
// 或者在启动类上使用@EnableConfigurationProperties(Class<?>[] value() default {})
@ConfigurationProperties(prefix = "info")
public class MyInfo {
    private String name;
    private Integer age;
    private String tel;
    private String[] hobbies;

    @Override
    public String toString() {
        return "MyInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }
}
