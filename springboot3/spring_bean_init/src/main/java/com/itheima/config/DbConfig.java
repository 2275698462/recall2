package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

    @Bean
    public DruidDataSource dataSource88(){
        DruidDataSource ds = new DruidDataSource();
        return ds;
    }
}
