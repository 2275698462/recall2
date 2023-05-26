package com.illusion.create;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 创建线程的方式4：使用线程池
 *
 * 好处：
 * 1、提高响应速度（减少了创建新线程的时间）
 * 2、降低资源消耗（重复利用线程池中线程，不需要每次都创建）
 * 3、便于线程管理
 */
class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":"+ i);
            }
        }
    }
}
class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":"+ i);
            }
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        //1、提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service; //向下转型，强转

        //设置线程池的属性
        System.out.println(service.getClass());//运行类型是ThreadPoolExecutor
        service1.setCorePoolSize(15);//改变线程池的大小

        //2、执行指定的线程池操作，需要提供Runnable或Callable接口实现类的对象
        service.execute(new NumberThread());//适合使用于Runnable
        service.execute(new NumberThread1());//适合使用于Runnable

//        service.submit(Callable callable);//适合使用于Callable

        service.shutdown();//3、关闭线程池



    }
}
