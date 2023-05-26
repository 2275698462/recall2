package com.illusion.override_;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String say(){
        return "姓名=" + name + " 年龄=" + age;
    }
}
