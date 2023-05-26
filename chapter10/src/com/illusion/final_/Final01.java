package com.illusion.final_;

public class Final01 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
    }
}
class BBB {
    public final static int num = 1000;
    static {
        System.out.println("BBB静态");
    }
}
class A {
    private static final int AA_AA;
    static {
        AA_AA = 1;
    }
}