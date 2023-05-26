package com.illusion.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}
class A{
    //静态属性初始化
    private static int n1 = get();

    static {//静态代码块
        System.out.println("A静态代码块01");
    }
    public static int get(){
        System.out.println("get被调用");
        return 100;
    }
}