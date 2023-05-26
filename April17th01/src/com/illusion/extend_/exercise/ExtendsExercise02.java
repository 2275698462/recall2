package com.illusion.extend_.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        PC pc = new PC("aa", 99 , "bb", "cc");
        pc.prinInfo();

        NotePad notePad = new NotePad("aa", 99 , "bb", "kk");
        notePad.getColor();
    }
}
