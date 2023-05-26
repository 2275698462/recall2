package com.illusion.wrapper;

public class Integer01 {
    public static void main(String[] args) {
        //演示int -> Integer的装箱和拆箱
        //jdk5以前是手动装箱和拆箱
        //手动装箱
        int n1 = 100;
        Integer integer01 = new Integer(n1); //第一种
        Integer integer02 = Integer.valueOf(n1); //第二种
        //手动拆箱
        //Integer -> int
        int i = integer01.intValue();

        //jdk5后，就可以自动装箱和自动拆箱
        int n2 = 200;

        //自动装箱， int -> Integer
        Integer integer = n2; //底层使用的是Integer.valueOf(n2)

        //自动拆箱， Integer -> int
        int n3 = integer; //底层仍然使用的是intValue()方法
    }
}
