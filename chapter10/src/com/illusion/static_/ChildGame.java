package com.illusion.static_;

public class ChildGame {
    public static void main(String[] args) {
        int count = 0;
        Child aa = new Child("aa1");
        aa.join();
        count++;
        Child bb = new Child("aa2");
        bb.join();
        count++;
        Child cc = new Child("aa3");
        cc.join();
        count++;

        System.out.println("共有" + count + "个");
    }
}
class Child{
    private String name;
    public static int count;
    public Child(String name){
        this.name = name;
    }
    public void join(){
        System.out.println(name + "加入游戏");
    }
}