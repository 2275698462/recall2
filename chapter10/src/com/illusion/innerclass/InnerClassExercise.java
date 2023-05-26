package com.illusion.innerclass;

import com.illusion.abstract_.Template;

public class InnerClassExercise {
    public static void main(String[] args) {

    }
}
class Test {
    public Test(){

    }
    class Inner{
        public int a = 5;
    }

    public static void main(String[] args) {
        Test t = new Test();
        Inner r = t.new Inner(); //因为main方法是在Test类中，所以Inner r前不用加 Test
    }
}