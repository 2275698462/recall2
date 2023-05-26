package com.illusion.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);
        System.out.println(instance2 == instance); //true 同一个对象，因为static只会执行一次
    }
}

//有一个类，GirlFriend
//只能有一个女朋友
class GirlFriend {
    private String name;
    //为了能够在静态方法中，返回gf对象，需将其修饰为static
    private static GirlFriend gf = new GirlFriend("小红红");

    //如何保证只能创建一个GirlFriend对象
    //步骤(单例模式--饿汉式)
    //1.将构造器私有化
    //2.在类的内部直接创建
    //3.提供一个公共的static方法，返回gf对象
    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}