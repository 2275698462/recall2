package com.illusion.homework08;

public class Test {
    public static void main(String[] args) {
        Color blue = Color.BLUE;
        blue.show();
        //switch中，放入枚举对象引用
        //在每个case后。直接写上在枚举类中定于的枚举对象即可
        switch (blue) {
            case YELLOW:
                System.out.println("黄色");
                break;
            case BLACK:
                System.out.println("黑色");
                break;
            default:
                System.out.println("没有匹配到");
        }
    }
}
