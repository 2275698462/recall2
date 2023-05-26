package com.illusion.String;

public class String01 {
    public static void main(String[] args) {
        //String是final类，不能背其他的类继承
        //String有属性private final char value[];用于存放字符串内容
        //value是一个final类型，不可以修改，即value不能指向新的地址，但是单个字符串可以改变
        final char[] value = {'a', 'b', 'c'};
        value[0] = 'p';
        char[] v2 = {'s'};
        //value = v2;  不可以修改 value的地址
        String s1 = "a";
        String s2 = "a";
        System.out.println(s1 == s2);

    }
}
