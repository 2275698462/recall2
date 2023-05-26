package com.illusion.enum_;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver(){
       if (! (vehicles instanceof Boat) ){
           vehicles = Factory.getBoat();
       }
       vehicles.work();
    }
    public void common(){
       if (! (vehicles instanceof Horse)) {
           vehicles = Factory.getHorse();
       }
        vehicles.work();

    }
}
