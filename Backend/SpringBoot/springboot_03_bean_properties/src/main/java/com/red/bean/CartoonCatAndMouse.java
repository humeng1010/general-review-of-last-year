package com.red.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.StringUtils;


@Slf4j
@Data
//@ConditionalOnClass(name = {"com.red.Main"})
@EnableConfigurationProperties(CartoonProperties.class)
public class CartoonCatAndMouse implements ApplicationContextAware {

    /**
     * 猫的默认名称
     */
    private static final String CAT_NAME = "tom";
    /**
     * 猫的默认年龄
     */
    private static final Integer CAT_AGE = 3;

    /**
     * 老鼠的默认名称
     */
    private static final String MOUSE_NAME = "jerry";

    /**
     * 猫的默认年龄
     */
    private static final Integer MOUSE_AGE = 2;
    private Cat cat;
    private Mouse mouse;

    private CartoonProperties cartoonProperties;

    //构造器注入
    public CartoonCatAndMouse(CartoonProperties cartoonProperties) {
        this.cartoonProperties = cartoonProperties;
        cat = new Cat();
//        如果配置中有值,则使用配置类的值,否则使用默认值
        cat.setName(cartoonProperties.getCat()!=null && StringUtils.hasText(cartoonProperties.getCat().getName())
                ? cartoonProperties.getCat().getName()
                : CAT_NAME);
        cat.setAge(cartoonProperties.getCat()!=null && cartoonProperties.getCat().getAge()!=null
                ? cartoonProperties.getCat().getAge()
                : CAT_AGE);

        mouse = new Mouse();

        mouse.setName(cartoonProperties.getMouse()!=null && StringUtils.hasText(cartoonProperties.getMouse().getName())
                ? cartoonProperties.getMouse().getName()
                : MOUSE_NAME);
        mouse.setAge(cartoonProperties.getMouse()!=null && cartoonProperties.getMouse().getAge()!=null
                ? cartoonProperties.getMouse().getAge()
                : MOUSE_AGE);
    }

    public void play(){
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        log.info("{}岁的{}和{}岁的{}打起来了",cat.getAge(),cat.getName(),mouse.getAge(),mouse.getName());
    }

    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
