package com.illusion.extend_;

//讲解继承本质
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        //按照查找关系来返回信息
        //1、首先看子类是否有该属性
        //2、如果子类有这个属性，并且可以访问，则返回信息
        //3、如果子类没有，就看父类有没有这个属性
        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}

class GrandPa {
    String name = "爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa {
    String name = "爸爸";
    int age = 39;
}

class Son extends Father {
    String name = "儿子";
}
