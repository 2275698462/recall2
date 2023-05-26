package com.illusion.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(Cat.n1);
    }
}
class Cat{
    public static int n1 = 100;
    static {
        System.out.println("Cat静态代码块被执行");
    }
}
class AA extends BB{
    static {
        System.out.println("AA静态代码块被执行");
    }
}
class BB{
    static {
        System.out.println("BB静态代码块被执行");
    }
}