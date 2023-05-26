package com.illusion.homework01.Homework08;

public class CheckingAccount extends BankAccount{ //新的账号
    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
