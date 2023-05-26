package com.illusion.generic;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("all")
public class Generic01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("小白", 10));
        arrayList.add(new Dog("aa", 30));
        arrayList.add(new Dog("bb", 20));
        arrayList.add(new Cat("dd", 20));
        for(Object o : arrayList) {
            //向下转型
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "--" + dog.getAge());
        }
    }
}
@SuppressWarnings("all")
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
