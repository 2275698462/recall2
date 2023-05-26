package com.illusion.modifier;

public class A {
    //四个属性
    public int n1 = 10;
    protected int n2 = 20;
    int n3 = 30;
    private int n4 = 40;
    //在同一个类中可以访问四个
    public void m1(){
        System.out.println(n1 + n2 + n3 + n4);
    }
}
