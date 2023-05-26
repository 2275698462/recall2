package com.illusion.homework01.Homework05;

public class Staff {
    private double salary;
    public Staff(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void printsal(){
        System.out.println(salary * 12);
    }
}
