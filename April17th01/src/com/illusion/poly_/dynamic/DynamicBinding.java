package com.illusion.poly_.dynamic;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B(); //向上转型
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
