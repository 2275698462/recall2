package com.illusion.homework01.Homework08;

public class BankAccount {
    private int balance;//余额

    public BankAccount(int balance) {
        this.balance = balance;
    }
    //存款
    public void deposit(double amount) {
        balance += amount;
    }
    //取款
    public void withdraw(double amount){
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
