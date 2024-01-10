package com.BankSystem;

public class AccountTransition {

    public static  void deposit(Account account, double amount){
        double newBalance = amount + account.getBalance();
        account.setBalance(newBalance);

        System.out.println("Deposit: "+amount+" New Balance: "+newBalance);
        System.out.println("-----------------------------------");

    }
    public static void withdraw(Account account , double amount){
        if(account.ifBalanceSufficient(amount)){
            double newBalance = account.getBalance() -amount;
            account.setBalance(newBalance);
            System.out.println("WithDraw: "+ amount+" New Balance: "+ newBalance);
            System.out.println("-----------------------------------");


        }
        else{
            System.out.println("Insufficient balance!!");
        }
    }

}
