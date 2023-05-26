package com.illusion.throws_;

public class ThrowException {
    public static void main(String[] args) {
        try {
            ReturnExceptionDemo.methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage()); //3
        }
        ReturnExceptionDemo.methodB();
    }
}
class ReturnExceptionDemo{
    static void methodA(){
        try {
            System.out.println("进入方法A");  //1
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("A方法的finally");  //2
        }
    }
    static void methodB(){
        try {
            System.out.println("进入方法B"); //4
            return;
        } finally {
            System.out.println("B的finally"); //5
        }
    }
}