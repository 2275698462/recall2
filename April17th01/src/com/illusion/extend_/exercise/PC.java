package com.illusion.extend_.exercise;

public class PC extends Computer {
    private String brand;

    public PC(String CPU, int Memory, String disk, String brand) {
        super(CPU, Memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void prinInfo(){
        System.out.println("pc信息如下");
        System.out.println(getDetails() + " 品牌=" + brand);
    }
}
