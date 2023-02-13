package com.red.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@Import({JdbcConfig.class})
@ComponentScan("com.red")
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {

}
