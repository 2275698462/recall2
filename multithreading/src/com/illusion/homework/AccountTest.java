package com.illusion.homework;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行有一个账户，
 * 有两个储户分别向同一个账户存3000元，每次存1000，存三次，每次存完打印账户余额
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);
        c1.setName("甲");
        c2.setName("乙");
        c1.start();
        c2.start();
    }
}
class Account{
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    //存钱
    public void deposit(double amt){

        Customer.lock.lock();
        if (amt > 0) {
            balance += amt;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println( Thread.currentThread().getName() + "存钱成功，余额为：" + balance);
        }
        Customer.lock.unlock();
    }
}
class Customer extends Thread {
    public static ReentrantLock lock = new ReentrantLock();
    private Account acct;


    public Customer(Account acct) {
        this.acct = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }
    }
}
