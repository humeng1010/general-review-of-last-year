package com.red.config;

import com.red.entity.Cat;
import com.red.entity.DogFactoryBean;
import org.springframework.context.annotation.*;

//@Configuration(proxyBeanMethods = false)//会重新得到一个对象
//所以使用Configuration注解的类本质上是一个配置类
@Configuration(proxyBeanMethods = true)//执行cat方法会从容器中获取bean不是重新创建
@ComponentScan("com.red")
@Import({JdbcConfig.class})
//配置类中引入原始的xml的方式的配置文件
@ImportResource("classpath:applicationContext.xml")
public class SpringConfig{

    @Bean
    public DogFactoryBean dog(){
        return new DogFactoryBean();
    }

    @Bean
    public Cat cat(){
        return new Cat();
    }
}
