package com.illusion.single_;

public class SingleTon02 {
    public static void main(String[] args) {
//        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        Cat instance2 = Cat.getInstance();
        System.out.println(instance);

        System.out.println(instance == instance2);
    }
}

//希望在程序运行过程中，只能创建一个Cat对象
class Cat {
    private String name;
    public static int n1 = 999;
    private static Cat cat;
    //步骤 -- 懒汉式
    //1.仍然构造器私有化
    //2.定义一个static静态属性对象
    //3.提供一个public的static方法，可以返回一个Cat对象
    //4.懒汉式，只有当用户使用getInstance时，才返回cat对象，后面再次调用时，会返回上次创建的cat对象，从而保证单例

    private Cat(String name) {
        this.name = name;
    }
    public static Cat getInstance(){
        if (cat == null) {
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
