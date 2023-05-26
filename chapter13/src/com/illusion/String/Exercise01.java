package com.illusion.String;

public class Exercise01 {
    public static void main(String[] args) {
        String a = "sad"; //a指向常量池的“sad”
        String b = new String("sad");//b指向堆中对象
        System.out.println(a.equals(b)); //T
        System.out.println(a == b); //F
        System.out.println(a == b.intern()); //T
        System.out.println(b == b.intern()); //F
        //intern返回的是常量池地址
    }
}
