package com.illusion.homework01.homework04;

public class Manager extends Staff{
    private double bonus;

    public Manager(String name, double salary, int days, double bonus, double grade) {
        super(name, salary, days, grade);
        this.bonus = bonus;
    }

    @Override
    public void print() {
        System.out.println(bonus + (getSalary() * getDays() * getGrade()));
    }
}
