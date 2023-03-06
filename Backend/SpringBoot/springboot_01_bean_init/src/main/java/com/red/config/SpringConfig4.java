package com.red.config;

import com.red.bean.MyPostProcessor;
import com.red.bean.MyRegister;
import com.red.service.impl.BookServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BookServiceImpl.class, MyRegister.class, MyPostProcessor.class})
public class SpringConfig4 {
}
