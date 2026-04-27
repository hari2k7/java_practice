package com.hari.java.miniprojects.management;

import java.io.*;
import java.util.Scanner;

abstract class Account{
    int accountNumber;
    String accountHolderName;
    double balance;

    final double MIN_BALANCE = 1000;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    void displayAccountDetails(){
        System.out.println("accountNumber: "+accountNumber);
        System.out.println("accountHolderName: " + accountHolderName);
        System.out.println("balance: " + balance);
    }

    abstract void calculateInterest();

    final void generateStatement() {
        System.out.println("Generating Account Statement...");
        System.out.println("Account Number: " + accountNumber +
                " | Name: " + accountHolderName +
                " | Balance: " + balance);
    }
}

interface TransactionService{
    void  deposit(double amount) throws Exception;
    void withdraw(double amount) throws Exception;
}

class PremiumAccount extends Account implements TransactionService{
    double withdrawalLimit;

    public PremiumAccount(int accountNumber, String accountHolderName, double balance, double withdrawalLimit) {
        super(accountNumber, accountHolderName, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountDetails(){
        System.out.println("Premium accountNumber: "+accountNumber);
        System.out.println("accountHolderName: " + accountHolderName);
        System.out.println("balance: " + balance);
        System.out.println("withdrawalLimit: " + withdrawalLimit);
    }
    @Override
    public void calculateInterest() {
        double interest = 0.05 * balance;
        System.out.println("Interest: " + interest);
    }

    @Override
    public void deposit(double amount) throws Exception {
        if(amount<=0) {
            throw new Exception("Invalid transaction amount");
        }
        balance += amount;
        System.out.println("Deposited successfully");
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if(amount<=0) {
            throw new Exception("Invalid transaction amount");
        }
        if(balance - amount < MIN_BALANCE) {
            throw new Exception("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Amount withdrawn successfully");
    }
}

public class SmartBankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        PremiumAccount acc = null;

        do {

            System.out.println("\n===== SMART BANKING SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Details");
            System.out.println("5. Generate Statement");
            System.out.println("6. Calculate Interest");
            System.out.println("7. Save to File");
            System.out.println("8. Read from File");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();


            switch(choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Balance: ");
                    double bal = sc.nextDouble();

                    System.out.print("Enter Withdrawal Limit: ");
                    double limit = sc.nextDouble();

                    acc = new PremiumAccount(accNo, name, bal, limit);
                    System.out.println("Account created successfully.");
                    break;

                case 2:
                    if(acc != null) {
                        System.out.println("Enter amount to deposit: ");
                        double damount = sc.nextDouble();
                        try {
                            acc.deposit(damount);
                        }catch(Exception e) {
                            System.out.println("Error: "+ e.getMessage());
                        }
                        break;
                    }else {
                        System.out.println("create account first");
                        break;
                    }

                case 3:
                    if(acc != null) {
                        System.out.println("Enter amount to withdraw: ");
                        double wamount = sc.nextDouble();
                        try {
                            acc.withdraw(wamount);
                        }catch(Exception e) {
                            System.out.println("Error: "+ e.getMessage());
                        }
                        break;
                    }else {
                        System.out.println("create account first");
                        break;
                    }

                case 4:
                    if(acc!=null) {
                        acc.displayAccountDetails();
                        break;
                    }else {
                        System.out.println("create account first");
                        break;
                    }

                case 5:
                    if(acc!=null) {
                        acc.generateStatement();
                        break;
                    }else {
                        System.out.println("create account first");
                        break;
                    }

                case 6:
                    if(acc!=null) {
                        acc.calculateInterest();
                        break;
                    }else {
                        System.out.println("create account first");
                        break;
                    }

                case 7:
                    if(acc!=null) {
                        try {
                            FileWriter fw = new FileWriter("accounts.txt", true);
                            fw.write(acc.accountNumber + "," + acc.accountHolderName + "," + acc.balance + "\n");
                            fw.close();
                            System.out.println("File written successfully");
                        }catch(Exception e) {
                            System.out.println("File error");
                        }
                        break;
                    }else {
                        System.out.println("create account first");
                        break;
                    }

                case 8:
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("accounts.txt"));
                        String line;
                        while((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                        br.close();
                    }catch(Exception e) {
                        System.out.println("File error");
                    }
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }while(choice != 9);
    sc.close();
    }

}
