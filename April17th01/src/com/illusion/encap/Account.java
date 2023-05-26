package com.illusion.encap;

public class Account {

}
class A{
    private String name;
    private double money;
    private String password;

    //提供两个构造器

    public A() {
    }

    public A(String name, double money, String password) {
       this.setPassword(password);
       this.setName(name);
       this.setMoney(money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("长度为2-4");
            this.name = "无名人";
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money > 20) {
            this.money = money;
        } else {
            System.out.println("你有点穷");
            this.money = -1;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        }else {
            System.out.println("密码要六位");
            this.password = "000000";
        }
    }
    //显示账号信息
    public void showInfo() {
        System.out.println("名称=" + name + " 密码=" + password + "  余额=" + money);
    }
}
