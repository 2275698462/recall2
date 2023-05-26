package com.illusion.homework06;

public class Factory1 {
    private static Horse horse = new Horse();
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }

    public static Fly getFly(){
        return new Fly();
    }
    private Factory1() {
    }
}
