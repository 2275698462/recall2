package com.illusion.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person = new Person("jack", 10, '男');
        Person person1 = new Person("jack", 10, '男');
        System.out.println(person.equals(person1));
    }
}
class Person{
    private String name;
    private int age;
    private char gander;
    //重写object的equals方法
    public boolean equals(Object obj) {
        //判断如果比较的两个对象是同一个对象，则直接返回true
        if (this == obj) {
            return true;
        }
        //类型判断
        if (obj instanceof Person) { //是Person才比较
            Person p = (Person) obj; //向下转型，因为需要得到ojb的各个属性
            return this.name.equals(p.name) && this.age == p.age && this.gander == p.gander;
        }
        //如果不是Person，则直接返回false
        return false;
    }

    public Person(String name, int age, char gander) {
        this.name = name;
        this.age = age;
        this.gander = gander;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGander() {
        return gander;
    }

    public void setGander(char gander) {
        this.gander = gander;
    }
}