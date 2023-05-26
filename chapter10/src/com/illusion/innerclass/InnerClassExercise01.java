package com.illusion.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        //当作实参直接传递，简洁高效
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一幅名画");
            }
        }); //匿名内部类本质上是一个对象
    }
    //静态方法
    public static void f1(IL il){
        il.show();
    }
}
interface IL{ //接口
    void show();
}