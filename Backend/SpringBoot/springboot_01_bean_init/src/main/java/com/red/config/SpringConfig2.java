package com.red.config;

import com.red.bean.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan({"com.red"})
@Import(MyImportSelector.class)
@Configuration
public class SpringConfig2 {
}
