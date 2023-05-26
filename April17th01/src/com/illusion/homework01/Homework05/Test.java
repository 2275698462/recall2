package com.illusion.homework01.Homework05;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker(3000);
        Teacher teacher = new Teacher(3000, 100, 10);
        Scientist scientist = new Scientist(3000, 300000);
        worker.printsal();
        teacher.printsal();
        scientist.printsal();
    }
}
