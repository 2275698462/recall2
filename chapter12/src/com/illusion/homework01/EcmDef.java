package com.illusion.homework01;

import java.util.Scanner;

public class EcmDef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        String s1 = scanner.next();
        try {
            int n1 = Integer.parseInt(s1);
            System.out.println("请输入第二个数");
            String s2 = scanner.next();
            int n2 = Integer.parseInt(s2);
            cal(n1 ,n2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
    public static void cal(int n1, int n2){
        System.out.println(n1 / n2);
    }
}
