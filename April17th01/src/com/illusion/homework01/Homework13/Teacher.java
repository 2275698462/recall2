package com.illusion.homework01.Homework13;

public class Teacher extends Person{
    private String work_age;

    public Teacher(String name, char sex, int age, String work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }
    public String getWork_age() {
        return work_age;
    }
    public void setWork_age(String work_age) {
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("我会好好教学");
    }

    @Override
    public String play() {
        return getName() + super.play() + "象棋";
    }
}
