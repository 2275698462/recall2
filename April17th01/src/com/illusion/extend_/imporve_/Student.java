package com.illusion.extend_.imporve_;
//父类，是Pupil 和 Graduate 的父类
public class Student {
    public String name;
    public int age;
    private double score;
    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo(){
        System.out.println("学生" + name + "年龄" + age + "成绩" + score);
    }
}
