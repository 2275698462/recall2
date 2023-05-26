package com.illusion.poly_.polyparamater_;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println(getName() + "正在管理");
    }
    public double getBonus() {
        return bonus;
    }
    public double getAnnual() {
        return super.getAnnual() + getBonus();
    }
}
