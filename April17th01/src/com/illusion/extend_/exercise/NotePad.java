package com.illusion.extend_.exercise;

public class NotePad extends Computer {
    private String color;

    public NotePad(String CPU, int Memory, String disk, String color) {
        super(CPU, Memory, disk);
        this.color = color;
    }
    public void getColor(){
        System.out.println(getDetails() + " 颜色=" + this.color);
    }
}
