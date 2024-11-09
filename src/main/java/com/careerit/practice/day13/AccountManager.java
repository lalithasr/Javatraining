package com.careerit.practice.day13;

import java.util.Scanner;
import java.util.*;

class Account{
    private static String bankName = "Bank of India";
    private String accNumber;
    private String name;
    private double balance;
    public Account(String accNumber, String name, double balance){
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }
    public void showInfo(){
        System.out.println("Bank Name : "+bankName);
        System.out.println("Account Number : "+accNumber);
        System.out.println("Name : "+name);
        System.out.println("Balance : "+balance);
    }
    public void withdraw(long amount){
        if(amount > balance){
            System.out.println("Insufficient balance. Your current balance is : " + balance);
        }else{
            balance -= amount;
            System.out.println("Amount :" + amount +" withdrawn successfully");
            System.out.println("Available balance : "+balance);
        }
    }

    public String toString(){
        return " Bank Details : "+ bankName + ", Account Number : "+accNumber + ", Name : "+name + ", Balance : "+balance+ ".";
    }
    public String getAccNumber(){
        return accNumber;
    }

}

public class AccountManager {

   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
         List<Account> accountList = new ArrayList<>();
            System.out.println("Enter the number of accounts you want to create:");
            int noOfAccounts = scanner.nextInt();
            scanner.nextLine();
            for (int i = 1; i <= noOfAccounts; i++) {
                System.out.println("Enter the account number for account " + i + ":");
                String accNumber = scanner.next();
                scanner.nextLine();
                System.out.println("Enter the name for account " + i + ":");
                String name = scanner.next();
                scanner.nextLine();
                System.out.println("Enter the balance for account " + i + ":");
                double balance = scanner.nextDouble();
                scanner.nextLine();
                accountList.add(new Account(accNumber, name, balance));
            }

            System.out.println("\nAccount details :");
            for(Account account : accountList){
                account.showInfo();
                System.out.println();
            }

            System.out.println("Bank details for all accounts : " + accountList.toString());

            System.out.println("Enter the account number for withdraw :");
            String accNumberforWithdrawal = scanner.nextLine();
            Account selectedAccount = null;
            for(Account account : accountList){
                if(account.getAccNumber().equals(accNumberforWithdrawal)){
                    selectedAccount = account;
                    break;
                }
            }

            if(selectedAccount != null){
                System.out.println("Enter the amount to withdraw :");
                long amount = scanner.nextLong();
                selectedAccount.withdraw(amount);
            }else{
                System.out.println("Account not found");
            }
            scanner.close();


    }
}
