package com.illusion.homework01.Homework08;

public class SavingAccount extends BankAccount{
    private int count = 3;
    private double rate = 0.1;

    public SavingAccount(int balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if(count > 0){
            super.deposit(amount);
            count--;
        } else {
            super.deposit(amount - 1);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
            count--;
        }else {
            super.withdraw(amount + 1);
        }
    }
    public void earnMonthInterest(){
        count = 3;
//      System.out.println(getBalance() * rate);
        super.deposit(getBalance() * rate);
    }
}
