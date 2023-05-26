package com.illusion.homework07;

public class Car {
    private double temperature;
    public Car(double temperature) {
        this.temperature = temperature;
    }
    class Air{
        public void flow(){
            if (temperature > 40) {
                System.out.println("冷气");
            } else if (temperature < 0) {
                System.out.println("暖气");
            } else {
                System.out.println("关掉空调");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}
