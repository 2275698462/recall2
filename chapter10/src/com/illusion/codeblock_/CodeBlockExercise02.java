package com.illusion.codeblock_;

public class CodeBlockExercise02 {
    public static void main(String[] args) {
        Test test = new Test();
    }
}

class Sample {
    Sample(String s) {
        System.out.println(s); //1
    }
    Sample(){
        System.out.println("Sample默认无参构造器被调用");
    }
}
class Test{
    Sample sam1 = new Sample("sam1成员初始化");//3
    static Sample sam = new Sample("静态成员sam初始化"); //1
    static {
        System.out.println("static执行");  //2
        if (sam == null){
            System.out.println("sam is null");
        }
    }
    Test(){
        System.out.println("Test默认构造器");  //4
    }
}