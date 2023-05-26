package com.illusion.encap;

public class AccountText {
    public static void main(String[] args) {
        A a1 = new A();
        a1.setMoney(30);
        a1.setName("ljc");
        a1.setPassword("123456");
        a1.showInfo();
        A a2 = new A("aaa", 10 , "aaaa");
        a2.showInfo();

    }
}
