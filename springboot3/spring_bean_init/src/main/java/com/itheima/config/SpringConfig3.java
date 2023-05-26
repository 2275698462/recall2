package com.itheima.config;

import com.itheima.bean.Dog;
import com.itheima.bean.DogFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.itheima")
public class SpringConfig3 {

    @Bean
    public DogFactoryBean dog1(){
        return new DogFactoryBean();
    }
}
