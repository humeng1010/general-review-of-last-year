package com.red.config;

import com.red.entity.DogFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.red")
@Import({JdbcConfig.class})
public class SpringConfig{


    @Bean
    public DogFactoryBean dog(){
        return new DogFactoryBean();
    }
}
