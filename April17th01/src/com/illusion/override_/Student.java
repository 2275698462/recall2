package com.illusion.override_;

public class Student extends Person {
    double score;
    int id;
    public Student(String name, int age, double score, int id) {
        super(name, age);
        this.score = score;
        this.id = id;
    }
    public String say(){
        System.out.println(super.say());
        return "成绩=" + score + " id=" + id;
    }
}
