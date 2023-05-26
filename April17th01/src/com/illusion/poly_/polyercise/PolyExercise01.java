package com.illusion.poly_.polyercise;

public class PolyExercise01 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count); //20,访问属性看编译类型
        s.display(); //20
        Base b = s; //向上转型，子类的引用赋给父类的引用
        System.out.println(b == s); //f
        System.out.println(b.count);//10
        b.display(); //20
    }
}
