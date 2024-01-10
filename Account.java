package com.BankSystem;

import java.security.PrivateKey;

public class Account {

    private String AccountNumber;

    private double balance;
    private double minBalance;

    public  Account(String AccountNumber,double balance ,double minBalance){
        this.AccountNumber = AccountNumber;
        this.balance =balance;
        this.minBalance= minBalance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean ifBalanceSufficient(double amount){
        return  balance - amount  >=minBalance;
    }
}
