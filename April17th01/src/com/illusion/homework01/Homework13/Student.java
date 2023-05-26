package com.illusion.homework01.Homework13;

public class Student extends Person{
    private String id;
    public Student(String name, char sex, int age, String id) {
        super(name, sex, age);
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void study(){
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public String play() {
        return getName() + super.play() + "足球";
    }

    @Override
    public String toString() {
        return  "Student{" +
                "id='" + id + '\'' +
                '}';
    }
}
