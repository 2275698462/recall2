package com.illusion.innerclass;
/**
 * 演示局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}
class Outer02 { //外部类
    private int n1 = 100;
    public void m1(){ //方法
        //局部内部类是定义在外部类的局部变量，通常在方法
        class Inner02{ //局部内部类
            private int n1 = 600;
            //可以直接访问外部类的所有成员，包括私有的
            public void f1(){
                System.out.println("n1=" + Outer02.this.n1); //Outer02.this本质上就是外部类的对象
                System.out.println("n1=" + n1);
            }
        }
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}