package com.illusion.exercise;

public class ThreadDemo {
    public static void main(String[] args) {
        //创建thread类的匿名子类的方法
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();
    }
}
