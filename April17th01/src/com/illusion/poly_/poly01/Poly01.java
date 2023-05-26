package com.illusion.poly_.poly01;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("小明");
        Dog dog = new Dog("小黄");
        Bone bone = new Bone("排骨");
        master.feed(dog, bone);
        Cat cat = new Cat("小白");
        Fish fish = new Fish("大鱼");
        master.feed(cat, fish);
    }
}
