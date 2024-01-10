package com.BankSystem;

import java.util.Scanner;

public class AccountIO {

    public static Account readAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accountNumber =scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter Minimum Balance: ");
        double minBalance = scanner.nextDouble();

        return new Account(accountNumber,balance,minBalance);
    }
    public  static  void displayAccount(Account account){
        System.out.println("Account Number: "+account.getAccountNumber());
        System.out.println("Balance: "+account.getBalance());
        System.out.println("Minimum Balance: "+account.getMinBalance());
    }

}
