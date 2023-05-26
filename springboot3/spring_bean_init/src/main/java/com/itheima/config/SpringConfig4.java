package com.itheima.config;

import com.itheima.bean.Cat;
import com.itheima.bean.Dog;
import com.itheima.bean.DogFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(DogFactoryBean.class)
public class SpringConfig4 {

}
