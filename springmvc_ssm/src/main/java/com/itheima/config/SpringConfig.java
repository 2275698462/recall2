package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration //配置类
@ComponentScan({"com.itheima.service"})  //包扫描
@PropertySource("classpath:jdbc.properties")  //加载properties
@Import({JdbcConfig.class, MyBatisConfig.class})  //导入其他配置类
@EnableTransactionManagement //开启事务
public class SpringConfig {
}
