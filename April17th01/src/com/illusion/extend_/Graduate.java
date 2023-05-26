package com.illusion.extend_;
//模拟大学生考试
public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void texting() {
        System.out.println(name + "正在大学考试");
    }
    public void showInfo(){
        System.out.println("学生" + name + "年龄" + age + "成绩" + score);
    }
}
