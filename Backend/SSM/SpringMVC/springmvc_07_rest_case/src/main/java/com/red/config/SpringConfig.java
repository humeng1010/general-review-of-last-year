package com.red.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(value = "com.red",excludeFilters = {
        @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Controller.class
        )
})
@Import({JdbcConfig.class,MybatisConfig.class})
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
