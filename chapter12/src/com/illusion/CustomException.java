package com.illusion;

public class CustomException {
    public static void main(String[] args) {
        int age = 200;
        //要求范围在18-120之间，否则抛出一个自定义异常
        if (!(age >= 18 && age <= 120)) {
            throw new AgrException("年龄要在18 - 120 之间");
        }
        System.out.println("范围正确");
    }
}
//自定义一个异常
class AgrException extends RuntimeException {
    public AgrException(String message) { //构造器
        super(message);
    }
}