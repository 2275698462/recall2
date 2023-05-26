package com.illusion.static_;

public class StaticExercise02 {
    public static void main(String[] args) {
        System.out.println(Person.getTotalPerson()); //0
        Person p1 = new Person();
        System.out.println(Person.getTotalPerson());//1
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }    
    }
}
class Person{
    private  int id;
    private static int total = 0;
    public static int getTotalPerson(){
        //id++;
        return total;
    }
    public Person(){
        total++;
        id = total;
    }
}