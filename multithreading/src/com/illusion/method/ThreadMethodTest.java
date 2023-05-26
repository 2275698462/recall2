package com.illusion.method;

/**
 * 1、start():启用当前线程;调用当前线程的run()
 * 2、run():通常需要重写Thread类的此方法，将创建的线程要执行的操作声明在此方法中
 * 3、currentThread():静态方法,返回当前代码的线程
 * 4、getName():获取当前线程的名字
 * 5、setName():设置当前线程的名字
 * 6、yield:释放当前CPU的执行权，不会释放锁
 * 7、join():在线程a中调用线程b的join()方法，此时线程a加入阻塞状态,直到线程b完全执行
 *           完后，线程a才结束阻塞状态
 * 8、sleep(Long millitime):让当前线程"睡眠"指定的millitime毫秒。在指定的millitime毫秒时间内,
 *                          当前线程是阻塞状态
 * 9、isAlive():判断当前线程是否还存活
 *
 * 线程的优先级:
 * 1、
 * MAX_PRIORITY = 10
 * NORM_PRIORITY = 5
 * MIN_PRIORITY = 1
 * 2、获取和设置当前线程的优先级：
 *    getPriority():获取线程的优先级
 *    setPriority():设置线程的优先级
 *
 *    说明：高优先级的线程要抢占低优先级线程CPU的执行权，但只是从概率上讲
 */
public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread();
        h1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            if (i == 20){
                try {
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
class HelloThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0){
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}