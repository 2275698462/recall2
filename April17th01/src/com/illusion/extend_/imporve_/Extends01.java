package com.illusion.extend_.imporve_;

import com.illusion.extend_.Graduate;
import com.illusion.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        com.illusion.extend_.Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.texting();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("============");
        com.illusion.extend_.Graduate graduate = new Graduate();
        graduate.name = "大明";
        graduate.age = 20;
        graduate.texting();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
