package com.illusion.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();

        //外部其他类使用静态内部类
        //方式1,可以通过类名直接访问，前提是满足访问权限
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //方式2
        //编写一个方法，可以访问静态内部类的对象实例
        Outer10.Inner10 inner101 = outer10.getInner10();
        System.out.println("======");
        inner101.say();

        //方式三，静态方法返回，不用创建外部类的对象实例
        Outer10.Inner10 inner102 = Outer10.getInner102();
    }
}

class Outer10 {
    private int n1 = 10;
    private static String name = "zhang";

    public static class Inner10 {
        public String name = "qq";
        public void say() {
            System.out.println(Outer10.name);
        }
    }
    public void m1(){
        Inner10 inner10 = new Inner10();
        inner10.say();
    }
    public Inner10 getInner10(){
        return new Inner10();
    }
    public static Inner10 getInner102(){
        return new Inner10();
    }
}