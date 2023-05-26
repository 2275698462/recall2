package com.illusion.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSays {
//    化繁为简
//    1、先完成显示菜单，并可以选择菜单，给出对应提示
//    2、完成零钱通明细
//       (1)可以把收益入账和消费保存到数组(2)对象(3)简单的话可以使用String拼接
//    3、完成收益入账  完成功能驱动程序员增加新的变量和代码
//        定义新的变量
//    4、消费
//    5、退出
//    6、用户输入4退出时，给出提示“你确定要退出吗y/n“，必须输入正确的y/n，否则循环输入指令，直到输入y或者n
//      (1)定义变量choice，接收用户的输入
//      (2)使用while+ break， 来处理接受到的输入时 y 或者 n
//      (3)退出while后，在判断choice是y还是n，就可以决定是否退出
//    7、在收益入账和消费时，判断金额是否合理，并给出相应的提示
     public static void main(String[] args) {
    //定义相关变量
      boolean loop = true;
         double money = 0;
         double balance = 0;
         double shopping = 0;
         Date date = null; //date是java.util.Date类型，表示日期
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化

         Scanner scanner = new Scanner(System.in);
         String key = "";
         String details = "---------------零钱通明细---------------";

         do {

          System.out.println("\n==========零钱通菜单============");
          System.out.println("\t\t\t1、零钱通明细");
          System.out.println("\t\t\t2、收益入账");
          System.out.println("\t\t\t3、消费");
          System.out.println("\t\t\t4、退     出");

          System.out.print("请输入(1 - 4): ");
          key = scanner.next();

          //使用switch分支控制
             switch(key) {
                 case "1" :
                     System.out.println(details);
                     break;
                 case "2" :
                     System.out.println("收益入账金额");
                     money = scanner.nextDouble();
                     //money值要校验
                     if (money <= 0) {
                         System.out.println("收益金额需要大于0");
                         break;
                     }
                     balance += money;
                     //拼接收益入账信息到details
                     date = new Date();//获取当前日期
                     details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
                     break;
                 case "3" :
                     System.out.println("消费金额");
                     shopping = scanner.nextDouble();
                     if (shopping <= 0 || shopping > balance) {
                         System.out.println("你的消费金额在0 -" + balance);
                         break;
                     }
                     balance -= shopping;
                     details += "\n消费\t-" + shopping + "\t" + sdf.format(date) + "\t" + balance;
                     break;
                 case "4" :
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
                     break;
                 default :
                     System.out.println("输入有误，请重新输入");
             }
      } while(loop);

         System.out.println("-----退出了零钱通-------");
     }
}
