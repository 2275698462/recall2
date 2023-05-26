package com.illusion.override_;

public class Override02 {
    public static void main(String[] args) {
        Person person = new Person("aaa", 18);
        System.out.println(person.say());
        Student student = new Student("bbb", 20, 100 ,0);
        System.out.println(student.say());
    }
}
