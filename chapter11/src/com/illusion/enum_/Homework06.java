package com.illusion.enum_;

public class Homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.common();
        tang.passRiver();
        tang.common();
        tang.common();
    }
}
interface Vehicles{
    void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("一般情况下骑马");;
    }

}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("下雨天开船");;
    }

}