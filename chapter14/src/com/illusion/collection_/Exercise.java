package com.illusion.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("aa", 5));
        list.add(new Dog("bb", 6));
        list.add(new Dog("cc", 7));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }
        System.out.println("=============================");
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
class Dog{
    private String name;
    private int age;
    
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
