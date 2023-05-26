package com.illusion.modifier;

public class B {
    public void say(){
        A a = new A();
        //同一个包下，不能访问private属性或方法
        System.out.println(a.n1 + a.n2 + a.n3);
    }
}
