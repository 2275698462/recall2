package com.illusion.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {

        //向上转型：父类的引用执行了子类的对象
        //语法：父类类型  引用名  =  new  子类类型()
        Animal animal = new Cat();

        // 可以调用父类中的所有成员（遵守访问权限），不能调用子类中特有成员
        //最终运行类型看子类(运行类型)的具体表现，即调用方法时，按照从子类(运行类型)开始查找方法
        //，然后调用，规则同前面的方法调用规则一致
        animal.eat();
        animal.run();

        //调用Cat的catchMouse方法   多态的向下转型
        //1、语法：子类类型   引用名  =  (子类类型)  父类引用
        Cat cat = (Cat) animal;
        cat.catchMouse();
        cat.show();
//        2、只能强制父类的引用，不能强转父类的对象
//        3、要求父类的引用必须指向的是当前目标类型的对象
//        4、当向下转型后，可以调用子类类型中所有的成员
    }
}
