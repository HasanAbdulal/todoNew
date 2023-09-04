package com.think.javaOOP.question01;

/*
 * Write a program to create a bank account with the following fields: account number, account name, amount.
 * */
public class NewBankAccount {
    private int accountNo;
    private String accountName;
    private double amount;

    public void insertAccount(int accountNo, String accountName, double amount) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.amount = amount;
    }

    public void deposit(double amount) {
        this.amount += amount;
        System.out.println("Deposited: " + this.amount);
    }

    public void withdraw(double amount) {
        if (this.amount < amount) { // When the amount in bank account is less than the amount to be withdrawn
            System.out.println("Insufficient funds");
        } else {
            // Otherwise, withdraw the amount
            this.amount -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public float checkBalance() {
        System.out.println("Balance: " + this.amount);
        return (float) this.amount;
    }

    @Override
    public String toString() {
        return "NewBankAccount{" +
            "accountNo=" + accountNo +
            ", accountName='" + accountName + '\'' +
            ", amount=" + amount +
            '}';
    }
}
