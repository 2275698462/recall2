package com.itheima.app;

import com.itheima.bean.Cat;
import com.itheima.bean.Dog;
import com.itheima.config.SpringConfig4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig4.class);
        //上下文容器对象初始化完毕后，手工加载bean
        ctx.registerBean("tom666", Cat.class);
        String[] names = ctx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("==============");
    }
}
