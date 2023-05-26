package com.illusion.generic.exercise.exercise01;

import java.util.HashMap;
import java.util.HashSet;

public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("aa", 11));
        students.add(new Student("bb", 21));
        students.add(new Student("cc", 13));

        for(Student st : students) {
            System.out.println(st);
        }

        HashMap<String, Student> hm = new HashMap<>();
        hm.put("dd", new Student("dd", 12));
        hm.put("qq", new Student("qq", 52));
        hm.put("ww", new Student("ww", 32));

        //迭代器
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}