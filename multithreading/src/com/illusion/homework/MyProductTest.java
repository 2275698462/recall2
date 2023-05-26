package com.illusion.homework;

public class MyProductTest {
    public static void main(String[] args) {
        C c = new C();
        A a = new A(c);
        B b = new B(c);
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.setName("消费者1");
        t2.setName("生产者1");
        t2.start();
        t1.start();

    }
}

class C {
    private int number = 0;

    public synchronized void c() { //生产产品
        if (number < 20) {
            number++;
            System.out.println(Thread.currentThread().getName() + "开始生产第" + number + "个产品");
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
        public synchronized void d(){ //消费产品
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "开始消费第" + number + "个产品");
                number--;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    class A implements Runnable { //消费者
        public C c;

        public A(C c) {
            this.c = c;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "开始消费产品。。。");
            while (true) {
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                c.d();
            }
        }
    }

    class B implements Runnable { //生产者
        public C c;

        public B(C c) {
            this.c = c;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "开始生产产品。。。");
            while (true) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                c.c();
            }
        }
    }