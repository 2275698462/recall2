package com.illusion.String;

public class StringTest1 {
    public static void main(String[] args) {
        /*
        String 与 char[]之间的转换
        String --> char[] :调用String的toCharArray()
        char[] --> String :调用String的构造器
         */
        String s1 = "abc123";
        char[] c = s1.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        char[] c2 = new char[]{'n','o'};
        String s2 = new String(c2);
        System.out.println(s2);
    }
}
