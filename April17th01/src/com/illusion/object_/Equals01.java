package com.illusion.object_;

public class Equals01 {
    public static void main(String[] args) {
        String s1 = new String("a");
        String s2 = new String("a");
        System.out.println(s1 == s2);
        System.out.println(s2.equals(s1));
    }
}

