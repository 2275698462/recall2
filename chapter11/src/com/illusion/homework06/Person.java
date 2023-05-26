package com.illusion.homework06;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        if (! (vehicles instanceof Boat)) {
            vehicles = Factory1.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        if (! (vehicles instanceof Horse)){
            vehicles = Factory1.getHorse();
        }
        vehicles.work();
    }
    public void fire(){
        if (! (vehicles instanceof Fly)) {
            vehicles = Factory1.getFly();
        }
        vehicles.work();
    }
}
