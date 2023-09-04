package com.think.javaOOP.question01;

public class Main {
    public static void main(String[] args) {
        NewBankAccount nba = new NewBankAccount();
        nba.insertAccount(343325456, "John Doe", 1090.98);
        nba.deposit(510);
        nba.withdraw(200);
        System.out.println(nba.checkBalance());
        System.out.println(nba.toString());
    }
}
