package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    double interest;
    double total;

    public SavingsAccount(double balance, long accountNumber) {
        super(balance, accountNumber);

    }

    public double addinterest() {
        this.total = this.balance + interest;
        return total;
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
