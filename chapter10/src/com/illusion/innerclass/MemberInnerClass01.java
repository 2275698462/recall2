package com.illusion.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        //外部其他类使用成员内部类的三种方式
        //第一种方式,相当于把 new Inner08()当作是outer的成员
        Outer08.Inner08 inner08 = outer08.new Inner08();
        //第二中方式，在外部类中编写一个方法，可以返回Inner对象
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();

    }
}
class Outer08{
    private int n1 = 10;
    public String name = "aa";

    class Inner08{//成员内部类
        private int n1 = 10;
        public void say(){
            //可以直接访问外部类的所有成员
            System.out.println(Outer08.this.n1);
        }
    }

    public void t1(){
        Inner08 inner08 = new Inner08();
        inner08.say();
    }
    public Inner08 getInner08Instance(){
        return new Inner08();
    }
}