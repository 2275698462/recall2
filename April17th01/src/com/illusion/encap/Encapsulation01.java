package com.illusion.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackaaa");
        person.setAge(3000);
        person.setSalary(30000);
        System.out.println(person.info());
        System.out.println(person.getSalary());
        Person person2 = new Person("jackaaa", 3000,30000);
        System.out.println("=======");
        System.out.println(person2.info());

    }
}
class Person {
    public String name;//名字公开
    private int age;//age 私有化
    private double salary;

    //构造器
    public Person() {
    }
    //有三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //可以将set方法写在构造器中，这样仍然可以保证
        setSalary(salary);
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("你的名字太长了");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("输入年龄有误");
            this.age = 18;
        }
    }

    public double getSalary() {
        //增加权限设置
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info() {
        return "name = " + name + "  age = " + age + "  salary = " + salary;
    }
}
