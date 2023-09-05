package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    double overdraft;

    public CurrentAccount(double balance, long accountNumber) {
        super(balance, accountNumber);

    }

    @Override
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("The amount is too low");
        }
        balance = balance + amount;

    }

    public double withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("The amount is too low");
        }

        balance = balance - amount;
        return balance;

    }
}
