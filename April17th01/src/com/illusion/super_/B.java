package com.illusion.super_;

public class B extends A {
    //1、访问父类的属性和方法，但不能访问父类的私有属性和方法
    public void hi(){
        System.out.println(super.n1);
        super.test100();
    }
    public B(){
        super();
    }
    //找cal方法，顺序是：
//    1、先找本类
//    2、如果没有，找父类
//    3、父类没有，就找父类的父类
//    提示：如果查找方法过程中，找到了，但是不能访问，则报错
    public void sum(){
        System.out.println("B类sun()");
        cal();
        //this.cal()//等价于cal()
        super.cal();//找cal方法的顺序是直接到父类去查找
    }
}
