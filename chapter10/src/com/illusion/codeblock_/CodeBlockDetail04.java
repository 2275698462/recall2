package com.illusion.codeblock_;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        System.out.println("total = " + Person.total);
        System.out.println("total = " + Person.total);
    }
}
class Person extends AAAA{
    public static int total; //静态属性

    static {
        total = 100;
        System.out.println("in static block");
    }
}
class AAAA {
    static {
        System.out.println("a");
    }
    {
        System.out.println("s");
    }
}
