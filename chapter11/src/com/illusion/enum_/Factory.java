package com.illusion.enum_;

public class Factory {
    private static Horse horse = new Horse();
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat() {
        return new Boat();
    }
}
