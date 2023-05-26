package com.illusion.poly_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
//        要求创建 1 个 Person 对象、2 个 Student 对象和
//        2 个 Teacher 对象, 统一放在组 中，并调用每个对象
        Person[] persons = new Person[5];
        persons[0] = new Person("aaa", 1);
        persons[1] = new Student("bbb", 1, 2);
        persons[2] = new Student("ccc", 1, 2 );
        persons[3] = new Teacher("ddd", 1, 2);
        persons[4] = new Teacher("eee", 1, 2);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if(persons[i] instanceof Student) { //判断person[i]的运行类型是不是Student
                Student student = (Student) persons[i];
                student.study();
                //也可以使用一条语句 ((Student)persons[i]).study();
            } else if(persons[i] instanceof  Teacher) {
                ((Teacher)persons[i]).teach();
            }
        }
    }
}
