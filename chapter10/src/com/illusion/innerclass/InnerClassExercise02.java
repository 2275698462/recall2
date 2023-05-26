package com.illusion.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //类似于 Bell bell = class  InnerClassExercise02$1 implement Bell {}
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellphone.alarmClock(new Bell() {
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}

interface Bell {
    void ring();
}
class Cellphone {
    public void alarmClock(Bell bell) {
        bell.ring();
    }
}
