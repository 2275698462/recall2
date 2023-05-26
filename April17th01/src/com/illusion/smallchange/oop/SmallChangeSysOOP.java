package com.illusion.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    /**
     * 该类是完成零钱通的各个功能的类
     * 使用OOP(面向对象功能)
     * 将各个功能对应一个方法
     */
    boolean loop = true;
    double money = 0;
    double balance = 0;
    double shopping = 0;
    Date date = null; //date是java.util.Date类型，表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化

    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "---------------零钱通明细OOP---------------";
    public void mainMenu() {
        do {
            System.out.println("\n==========零钱通菜单OOP============");
            System.out.println("\t\t\t1、零钱通明细");
            System.out.println("\t\t\t2、收益入账");
            System.out.println("\t\t\t3、消费");
            System.out.println("\t\t\t4、退     出");
            System.out.print("请输入(1 - 4): ");
            key = scanner.next();
            //使用switch分支控制
            switch(key) {
                case "1" :
                  this.detail();
                  break;
                case "2" :
                    this.income();
                    break;
                case "3" :
                   this.pay();
                    break;
                case "4" :
                   this.exit();
                    break;
                default :
                    System.out.println("输入有误，请重新输入");
            }
        } while(loop);
    }
    public void income(){
        System.out.println("收益入账金额");
        money = scanner.nextDouble();
        //money值要校验
        if (money <= 0) {
            System.out.println("收益金额需要大于0");
            return;
        }
        balance += money;
        //拼接收益入账信息到details
        date = new Date();//获取当前日期
        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
    }
    public void detail(){
        System.out.println(details);
    }
    public void pay(){
        System.out.println("消费金额");
        shopping = scanner.nextDouble();
        if (shopping <= 0 || shopping > balance) {
            System.out.println("你的消费金额在0 -" + balance);
            return;
        }
        balance -= shopping;
        details += "\n消费\t-" + shopping + "\t" + sdf.format(date) + "\t" + balance;
    }
    public void exit(){
        String choice = "";
        while(true) { //要求用户必须输入y / n, 否则就一直循环
            System.out.println("你确定要退出吗? y / n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)){
                break;
            }
        }
        //当用户退出while，进行判断
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
