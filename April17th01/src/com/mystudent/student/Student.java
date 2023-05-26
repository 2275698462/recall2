package com.mystudent.student;

@SuppressWarnings("all")
public class Student {
    private int id;
    private int sid;
    private int age;
    private String gender;
    private String name;
    private String address;

    public Student(int id, int sid, int age, String gender, String name, String address) {
        this.id = id;
        this.sid = sid;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return id + "\t\t"  +name + "\t\t" +
                age + "\t\t" +gender + "\t\t" + sid +"\t\t" +
                address;
    }
}
