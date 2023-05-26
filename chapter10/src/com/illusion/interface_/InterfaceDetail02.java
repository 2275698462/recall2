package com.illusion.interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.n1);
    }
}
interface IB{
    void hi();
    int n1 = 10; //等价于 public static final int n1 = 10;

}
interface IC{
    void say();
}

class Pig implements IB,IC {
    public void hi(){}
    public void say(){}
}

