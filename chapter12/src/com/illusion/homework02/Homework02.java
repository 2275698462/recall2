package com.illusion.homework02;

public class Homework02 {
    public static void main(String[] args) {
        //args.length = 0
        //这里发生的是 ArrayIndexOutOfBoundsException
        if (args[4].equals("join")) {
            System.out.println("AA");
        } else {
            System.out.println("BB");
        }
        Object o = args[2]; //String->Object,向上转型
        Integer i = (Integer)o; //错误，String -> Integer会发生类型转换异常
    }
}
