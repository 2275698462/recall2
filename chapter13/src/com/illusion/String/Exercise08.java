package com.illusion.String;

public class Exercise08 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "abc";
        //1、先创建一个StringBuilder sb = new StringBuilder()
        //2、执行 sb.append("hello")
        //3、执行 sb.append("abc")
        //4、String c = sb.toString()
        //最后c指向堆中的对象(String) value[] ->池中"helloabc"
        String c = a + b;
        String d = "helloabc";
        System.out.println(c == d); //false
        String e = a + "jack";
        String f = "hellojack";
        System.out.println(e == f); //false
    }
}
