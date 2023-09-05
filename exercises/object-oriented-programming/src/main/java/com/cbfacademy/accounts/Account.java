package com.cbfacademy.accounts;

public class Account {
    protected double balance;
    protected long accountNumber;

    // private double newbalance;
    public Account(double balance, long accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("The amount is too low");
        } else {
            balance = balance + amount;
        }

    }

    public double withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("The amount is too low");
        }
        else if(amount > balance){
            balance = balance - amount;
            
        }
        else{
             System.out.println("Insufficient funds, your balamce is" + balance);
        }
       
        return balance;

    }
}
