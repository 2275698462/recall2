package com.illusion.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态特点
        //animal 编译类型是Anima ， 运行类型是Dog
        Animal animal = new Dog(); //向上转型
        animal.cry();//小狗

        //animal编译类型是Animal,运行类型是Cat
        animal= new Cat();
        animal.cry();//小猫

    }
}
