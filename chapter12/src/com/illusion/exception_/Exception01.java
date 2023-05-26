package com.illusion.exception_;

public class Exception01 {
    public static void main(String[] args) {
        int num = 10;
        int num1 = 0;
        try {
            int res = num / num1;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("程序继续");
    }
}
