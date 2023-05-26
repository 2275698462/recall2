package com.illusion.homework01.Homework05;

public class Scientist extends Staff{
    private double bonus;

    public Scientist(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printsal() {
        System.out.println(getSalary() * 12 + bonus);
    }
}
