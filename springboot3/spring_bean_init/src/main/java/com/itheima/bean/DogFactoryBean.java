package com.itheima.bean;

import org.springframework.beans.factory.FactoryBean;

public class DogFactoryBean implements FactoryBean<Dog> {


    public Dog getObject() throws Exception {
        return new Dog();
    }

    public Class<?> getObjectType() {
        return Dog.class;
    }


    public boolean isSingleton() {
        return false;
    }
}
