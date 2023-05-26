package com.illusion.smallchange;

import java.util.Scanner;

public class NewSmall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean boo = true;
        String s1 = "";
        String s2 = "--------------零钱通明细---------------";
        String s3 = "";
        String key = "";
        double d1 = 0;
        double d2 = 0;
        double d3 = 0;
        do {
            System.out.println("\n==============零钱通菜单==============");
            System.out.println("\t\t\t1、零钱通明细");
            System.out.println("\t\t\t2、收益入账");
            System.out.println("\t\t\t3、消费");
            System.out.println("\t\t\t4、退    出");
            System.out.print("请选择(1-4):");
            s1 = scanner.next();
            switch (s1) {
                case "1" :
                    System.out.println(s2);
                    break;
                case "2" :
                    System.out.print("2、收益金额:");
                    d1 = scanner.nextDouble();
                    if(d1 <= 0 ){
                        System.out.println("输入有误，请重新输入");
                        break;
                    }
                    d3 += d1;
                    s2 += "\n收益入账\t+" + d1 + "\t" + "余额:" +  d3;
                    break;
                case "3" :
                    System.out.print("请输入消费内容:");
                    s3 = scanner.next();
                    System.out.print("3、消费金额: ");
                    d2 = scanner.nextDouble();
                    if (d2 > d3 || d2 <= 0) {
                        System.out.println("你的钱在0-" + d3);
                        break;
                    }
                    d3 -= d2;
                    s2 += "\n" + s3 + "\t-" + d2 + "\t" + "余额:" + d3;
                    break;
                case "4" : //只能输入 y / n,否则循环提示
                    do {
                        System.out.println("确定要退出吗，请输入 y / n");
                        key = scanner.next();
                        if (key.equals("y") || key.equals("n")){
                            break;
                        }
                    } while (true);
                    if (key.equals("y")){
                        boo = false;
                        break;
                    }
                default :
                    System.out.println("你输入有误，请重新输入");
            }
        } while (boo);
        System.out.println("退出零钱通项目");
    }
}
