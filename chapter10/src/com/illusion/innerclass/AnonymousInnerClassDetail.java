package com.illusion.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05{
    private int n1 = 99;
    public void f1(){
        //创建一个基于类的匿名内部类
        Person p = new Person() {
            private int n1 = 88;
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法");
                System.out.println("外部类n1 = " + Outer05.this.n1);
                //哪一个对象调用的f1，Outer05.this就是代表哪个对象 ，outer05
            }
        } ;
        p.hi(); //动态绑定机制 ，运行类型时Outer05$1

        //也可以直接调用
        new Person(){
            @Override
            public void hi() {
                System.out.println("hhhhh");
            }
        }.hi();
    }
}
class Person {
    public void hi(){
        System.out.println("Person hi()");
    }
}