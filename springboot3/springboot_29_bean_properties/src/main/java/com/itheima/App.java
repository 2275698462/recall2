package com.itheima;

import com.itheima.bean.CartoonCatAndMouse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Indexed;

@SpringBootApplication

//@SpringBootConfiguration
//    @Configuration
//        @Component
//    @Indexed
//
//@EnableAutoConfiguration
//    @AutoConfigurationPackage
//        @Import(AutoConfigurationPackages.Registrar.class)
//    @Import(AutoConfigurationImportSelector.class)
//
//@ComponentScan(excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
//        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
//

//@Import(AutoConfigurationPackages.Registrar.class)   设置当前配置所在的包作为扫描包，后续要针对当前的包进行扫描
//@Import(AutoConfigurationImportSelector.class)



@Import(CartoonCatAndMouse.class)
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(App.class);
        CartoonCatAndMouse bean = ctx.getBean(CartoonCatAndMouse.class);
        bean.play();
    }
}
