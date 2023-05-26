package com.illusion.wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        //包装类(Integer) ->String
        Integer i = 100;
        //方式1
        String s1 = i + "";
        //方式2
        String s2 = i.toString();
        //方式3
        String s3 = String.valueOf(i);

        //String -> 包装类Integer
        String s4 = "123";
        Integer i1 = Integer.parseInt(s4); //parseInt返回的是int,使用到自动装箱
        Integer i2 = new Integer(s4); //构造器
    }
}
