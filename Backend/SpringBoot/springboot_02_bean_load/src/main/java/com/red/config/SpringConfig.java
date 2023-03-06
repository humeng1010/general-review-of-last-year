package com.red.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.red.bean.Cat;
import com.red.bean.Dog;
import com.red.bean.Mouse;
import com.red.bean.MyImportSelector;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

//@Import(MyImportSelector.class)
//@Import({Mouse.class, Dog.class})
@ComponentScan("com.red.bean")
public class SpringConfig {

//    @Bean
//    按照条件加载:有这个类就加载这个bean
//    @ConditionalOnClass(Mouse.class)
//    没有这个则加载这个bean
//    @ConditionalOnMissingClass({"com.red.bean.Wolf"})
//    如果有一个叫做jerry的bean则加载这个bean,但是不能有Dog
//    @ConditionalOnBean(name = {"jerry"})
//    @ConditionalOnMissingBean(Dog.class)
//    public Cat tom(){
//        return new Cat();
//    }

    @Bean(name = {"data"})
//    如果有数据库连接驱动则加载数据库连接池
    @ConditionalOnClass(name = {"com.mysql.cj.jdbc.Driver"})
    public DataSource dataSource(){
        return new DruidDataSource();
    }
}
