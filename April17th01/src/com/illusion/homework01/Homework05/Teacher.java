package com.illusion.homework01.Homework05;

public class Teacher extends Staff{
    private double classSal;
    private int classday;
    public Teacher(double salary, double classSal, int classday){
        super(salary);
        this.classday = classday;
        this.classSal = classSal;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public int getClassday() {
        return classday;
    }

    public void setClassday(int classday) {
        this.classday = classday;
    }

    @Override
    public void printsal() {
        System.out.println(getSalary() * 12 + classSal * classday);
    }
}
