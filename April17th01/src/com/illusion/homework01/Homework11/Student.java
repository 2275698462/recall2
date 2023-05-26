package com.illusion.homework01.Homework11;

public class Student extends Person{
    public void run(){
        System.out.println("s run");
    }
    public void study(){
        System.out.println("s study");
    }

    public static void main(String[] args) {
        Person person = new Student();
        person.run();// s run
        person.eat();// p eat
        Student student = (Student)person;
        student.run();
        student.study();
        student.eat();
    }
}
