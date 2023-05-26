package com.illusion.enum_;

public class Homework02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

    }
}
class Frock{
    private static int currentNum = 100000;
    private int serialNumber;
    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    public Frock() {
        serialNumber = getNextNum();
    }
}