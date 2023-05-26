package com.illusion.abstract_;

abstract public class Template {
    public abstract void job();

    public void calculateTime(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("任务 执行时间" + (end - start));
    }
}
