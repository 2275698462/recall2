package com.illusion.homework01.Homework13;

public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Student("小明",'男', 15, "8823102");
        people[1] = new Student("小王",'男', 10, "5120022");
        people[2] = new Teacher("张飞",'男', 30, "5");
        people[3] = new Student("关羽",'男', 20, "6");

        Person temp = null;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getAge() < people[j + 1].getAge()) {
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
