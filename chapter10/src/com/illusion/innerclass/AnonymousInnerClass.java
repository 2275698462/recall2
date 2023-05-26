package com.illusion.innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04 { //外部类
    private int n1 = 10;
    public void method(){
        //基于接口的匿名内部类
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎");
            }
        } ;
        tiger.cry();

        //演示基于类的匿名内部类
        /**
         * 1、father的编译类型Father
         * 2、运行类型时Outer04$2
         */
        Father father = new Father("阿斯顿大少") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father运行类型 = " + father.getClass());
        father.test();
    }
}
interface IA { //接口
    public void cry();
}
class Father {
    public Father(String name) {
        System.out.println("接收到name = " + name);
    }
    public void test(){

    }
}