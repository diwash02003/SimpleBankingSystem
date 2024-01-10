package com.BankSystem;

import java.util.Scanner;

public class BankingMain {
    public static void main(String[] args) {

        Account account =AccountIO.readAccount();
        System.out.println("-----------------------------------");

        AccountIO.displayAccount(account);
        System.out.println("-----------------------------------");


        Scanner scanner = new Scanner(System.in);
        boolean flag =true;
        double amount;
        while(flag){
            System.out.println("\nChoose Operation\n1.Deposit\n2.Withdraw\n3.Display Amount\n4.Exit\n");

            int choice = scanner.nextInt();
            System.out.println("-----------------------------------");


            switch(choice){
                case 1:
                    System.out.println("Enter deposit amount: ");
                    amount = scanner.nextDouble();
                    AccountTransition.deposit(account,amount);
                    break;
                case 2:
                    System.out.println("Enter withdraw amount: ");
                    amount = scanner.nextDouble();
                    AccountTransition.withdraw(account,amount);
                    break;
                case 3:
                    AccountIO.displayAccount(account);
                    System.out.println("-----------------------------------");

                    break;
                case 4:
                    System.out.println("Exiting !!!");
                    flag = false;
                    break;
                default:
                    System.out.println("Enter valid choice !!!");
            }
        }

    }
}
