package com.red.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Component;

@Component("tom")
@ConditionalOnBean(name = {"jerry"})
//@ConditionalOnMissingClass("com.red.bean.Dog")
//@ConditionalOnWebApplication
public class Cat {
}
