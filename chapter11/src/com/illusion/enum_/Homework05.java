package com.illusion.enum_;

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.q();
    }
}
class A{
    private final String name = "qqq";
    public void q(){
        class B{
            private final String name = "aaa";
            public void show(){
                System.out.println(name);
                //重名用 外部类.this.属性名
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}