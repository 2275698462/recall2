package com.itheima.config;

import com.itheima.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration(proxyBeanMethods = false)
public class SpringConfig33 {
    @Bean
    public Cat cat(){
        return new Cat();
    }
}
