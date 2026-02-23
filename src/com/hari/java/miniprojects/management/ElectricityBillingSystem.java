package com.hari.java.miniprojects.management;

import java.util.Scanner;

/*
 * Mini Project: Smart Electricity Billing System
 * Implements slab rate billing with late surcharge
 */

class BillingAccount {

    private String customerName;
    private int accountNumber;
    private double unitsConsumed;
    private boolean isLate;

    private static final double BASE_CHARGE = 10.0;

    public BillingAccount(String customerName, int accountNumber,
                          double unitsConsumed, boolean isLate) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.unitsConsumed = unitsConsumed;
        this.isLate = isLate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    public double calculateBill() {

        if (unitsConsumed < 0) {
            return -1;
        }

        double total = BASE_CHARGE;

        if (unitsConsumed <= 100) {
            total += unitsConsumed * 0.50;
        }
        else if (unitsConsumed <= 300) {
            total += (100 * 0.50) +
                    ((unitsConsumed - 100) * 0.75);
        }
        else {
            total += (100 * 0.50) +
                    (200 * 0.75) +
                    ((unitsConsumed - 300) * 1.20);
        }

        if (isLate) {
            total *= 1.05;  // 5% surcharge
        }

        return total;
    }
}

public class ElectricityBillingSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== SMART ELECTRICITY BILLING SYSTEM =====");
            System.out.println("1. Calculate Consumer Bill");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Enter number of consumers: ");
                int n = scanner.nextInt();
                scanner.nextLine();

                BillingAccount[] accounts = new BillingAccount[n];

                for (int i = 0; i < n; i++) {

                    System.out.println("\nEnter details for Consumer " + (i + 1));

                    System.out.print("Customer Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Account Number: ");
                    int accNo = scanner.nextInt();

                    System.out.print("Units Consumed: ");
                    double units = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Payment Late? (yes/no): ");
                    boolean isLate = scanner.nextLine().equalsIgnoreCase("yes");

                    accounts[i] = new BillingAccount(name, accNo, units, isLate);
                }

                System.out.println("\n===== BILL DETAILS =====");

                for (BillingAccount account : accounts) {

                    double total = account.calculateBill();

                    System.out.println("\nCustomer Name : " + account.getCustomerName());
                    System.out.println("Account Number: " + account.getAccountNumber());
                    System.out.println("Units Consumed: " + account.getUnitsConsumed());

                    if (total == -1) {
                        System.out.println("Error: Units cannot be negative!");
                    } else {
                        System.out.printf("Total Bill     : $%.2f\n", total);
                    }
                }
            }
            else if (choice == 2) {
                System.out.println("Exiting program...");
            }
            else {
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 2);

        scanner.close();
    }
}