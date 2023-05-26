package com.illusion.homework01.Homework09;

public class LabeledPoint extends Point{
    private String point;
    public LabeledPoint(String point, double x, double y) {
        super(x, y);
        this.point = point;
    }

    public static void main(String[] args) {
        LabeledPoint black = new LabeledPoint("Black", 1929, 230.7);
    }
}
