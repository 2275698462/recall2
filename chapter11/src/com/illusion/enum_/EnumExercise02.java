package com.illusion.enum_;

public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] week = Week.values();
        System.out.println("==所有星期的信息如下==");
        for(Week week1: week) {
            System.out.println(week1);
        }
    }
}
enum Week{
    MONDAY("星期一"), TUESDAY("星期二"), THURSDAY("星期三"),
    FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    private String day;

    private Week(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return getDay();
    }
}