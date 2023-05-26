package com.illusion.innerclass;

public class InterClass01 { //外部其他类
    public static void main(String[] args) {

    }
}
class Outer{ //外部类
    private int n1 = 100; //属性
    public Outer(int n1) {
        this.n1 = n1;
    }

    public void m1(){ //方法
        System.out.println("m1()");
    }
    {//代码块
        System.out.println("代码块");
    }
    class Inner{ //内部类

    }
}
