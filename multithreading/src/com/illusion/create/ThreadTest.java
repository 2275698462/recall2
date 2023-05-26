package com.illusion.create;

/**
 * 多线程的创建, 方法一: 继承于Thread类
 * 1、创建一个继承于Thread类的子类
 * 2、重写Thread类的run() --> 将此线程执行的操作声明在run()中
 * 3、创建Thread类的子类的对象
 * 4、通过此对象调用start
 *
 * 例子:遍历100以内所有的偶数
 */

//1、创建一个继承于Thread的子类
class MyThread extends Thread{
    //2、重写
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3、创建Thread类的对象
        MyThread t1 = new MyThread();

        //4、通过此对象调用start():1、启动当前线程 2、调用当前线程的run()
        t1.start();

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(i + "=====main()=====");
            }
        }
    }

}
