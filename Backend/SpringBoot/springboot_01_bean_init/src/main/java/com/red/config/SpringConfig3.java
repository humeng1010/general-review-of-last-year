package com.red.config;

import com.red.bean.MyRegister;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(MyRegister.class)
@Configuration
public class SpringConfig3 {
}
