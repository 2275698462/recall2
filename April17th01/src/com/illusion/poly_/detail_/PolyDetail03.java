package com.illusion.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);
        AA aa = new BB();

        String str = "hello";

        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);

        Object obj = new Object();
        System.out.println(obj instanceof AA);//false
        System.out.println(str instanceof Object);//false
    }
}

class AA{} //父类
class BB extends AA{} //子类
