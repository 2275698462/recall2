package com.illusion.extend_.exercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        C c = new C();
    }
}
class A {
    public A() {
        System.out.println("我是A类");  //1
    }
}
class B extends A {
    public B() {
        System.out.println("我是B类的无参构造");
    }
    public B(String name) {
        System.out.println("我是B类的有参构造");  //2
    }
}
class C extends B {
    public C(){
        this("hello");
        System.out.println("我是C类的无参构造");  //4
    }
    public C(String name){
        super("hahah");
        System.out.println("我是C类的有参构造"); //3
    }
}
