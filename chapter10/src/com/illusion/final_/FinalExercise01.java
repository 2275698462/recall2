package com.illusion.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("面积=" + circle.calArea());
    }
}
class Circle{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    private final double PI = 3.14;
    public double calArea(){
        return PI * radius * radius;
    }
}
