package com.illusion.windowtest;

/**
 * 例子: 创建三个窗口卖票,总票数为100张,使用实现Runnable的方式
 *
 * 1、问题：买票过程中,出现了重票、错票-->出现了线程的安全问题
 * 2、问题出现原因:当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票
 * 3、如何解决:当一个线程a在操作ticket的时候,其他线程不能参与进来，直到线程a操作完ticket时，
 *          其它线程才可以操作ticket，这种情况即使线程a出现了阻塞，也不能被改变
 * 4、在Java中,通过同步机制解决线程的安全问题
 *
 * 方式一:同步代码块
 *      synchronized(同步监视器) {
 *          //需要被同步的代码 (操作共享数据的代码) -->不能包含代码多了，也不能包含代码少了
 *      }
 *      共享数据:多个线程共同创作的变量
 *      同步监视器,俗称：锁。任何一个类的对象都可以充当锁
 *方式二: 同步代码
 *      如果操作共享数据的代码完整的声明在一个方法中,我们不妨将此方法声明同步的
 *
 * 5、同步的方式,解决了线程的安全问题。--好处
 *    操作同步代码时，只能有一个线程参与，其他线程等待。相当于是一个单线程的过程,效率低--局限性
 */
class Window1 implements Runnable{
    private int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (this) {  //此时的this:唯一的Window1的对象      //方式二:synchronized (obj)
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票,票号为: " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w1 = new Window1();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
