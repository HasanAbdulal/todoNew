package com.think.javaOOP.exceptionExercise;

public class ThinkBank {
    private double balance;

    public void deposit(double amount) throws InvalidAmountException {
        if (amount < 0)
            throw new InvalidAmountException("Invalid amount: " + amount);
        balance += amount;
    }

    public double withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount)
            throw new InsufficientFundsException("Insufficient funds: " + amount + " > " + balance + "");
        balance -= amount;
        return amount;
    }

    public void balanceEnquiry() {
        System.out.println("Your balance is: " + balance);
    }

}
