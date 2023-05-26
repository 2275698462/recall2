package com.illusion.homework03;

public class Homework03 {
    public static void main(String[] args) {
        try {
            func();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C"); //2
        }
        System.out.println("D"); //3
    }
    public static void func(){
        try {
            throw new RuntimeException();
        }
        finally {
            System.out.println("B"); //1
        }
    }
}
