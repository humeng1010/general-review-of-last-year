package com.red.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {

    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/db1");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("12345678");
        return druidDataSource;
    }
}
