package com.illusion.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager aa = new Manager("aa", 20000);
        aa.work();
    }
}
abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
    }
    public abstract void work();
}
class Manager extends Employee{
    private double bonus;
    public Manager(String name, double bonus) {
        super(name);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println(getName() + "正在工作");
    }
}
