package com.red.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.red")
//加载properties配置文件
@PropertySource({"classpath:jdbc.properties"})
public class SpringConfig {
}
