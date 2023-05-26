package com.illusion.generic.exercise.exercise02;

import com.illusion.generic.exercise.exercise02.Employee;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> em = new ArrayList<>();
        em.add(new Employee("aa", 1000, new MyDate(5, 2, 3)));
        em.add(new Employee("bb", 2000, new MyDate(6, 6, 7)));
        em.add(new Employee("cc", 3000, new MyDate(8, 4, 2)));

        System.out.println(em);
        System.out.println("==============");
        em.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee em1, Employee em2) {
                return 0;
            }
        });
    }
}
