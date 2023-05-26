package com.itheima.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata metadata) {
        System.out.println("这里：" + metadata.getClassName());

        System.out.println(metadata.hasAnnotation("org.springframework.context.annotation.Configuration"));

        System.out.println(metadata.getAnnotationAttributes("org.springframework.context.annotation.ComponentScan"));
        return new String[]{"com.itheima.bean.Dog", "com.itheima.bean.Cat"};


    }
}
