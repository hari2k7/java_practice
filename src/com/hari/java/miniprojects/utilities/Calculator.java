package com.hari.java.mini_projects.utilities;

import java.util.Scanner;

/*
 * Mini Project: OOP Based Calculator
 * Demonstrates encapsulation and object-based operations
 */

class CalculatorNumber {

    private double value;

    public CalculatorNumber(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public double add(CalculatorNumber n) {
        return this.value + n.value;
    }

    public double subtract(CalculatorNumber n) {
        return this.value - n.value;
    }

    public double multiply(CalculatorNumber n) {
        return this.value * n.value;
    }

    public double divide(CalculatorNumber n) {
        if (n.value == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return this.value / n.value;
    }
}

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Start Calculation");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {

                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                CalculatorNumber n1 = new CalculatorNumber(num1);
                CalculatorNumber n2 = new CalculatorNumber(num2);

                System.out.println("\nSelect Operation:");
                System.out.println("(+) Add");
                System.out.println("(-) Subtract");
                System.out.println("(*) Multiply");
                System.out.println("(/) Divide");
                System.out.print("Op: ");

                char op = scanner.next().charAt(0);
                double result;

                switch (op) {
                    case '+':
                        result = n1.add(n2);
                        break;
                    case '-':
                        result = n1.subtract(n2);
                        break;
                    case '*':
                        result = n1.multiply(n2);
                        break;
                    case '/':
                        result = n1.divide(n2);
                        break;
                    default:
                        System.out.println("Invalid operation!");
                        continue;
                }

                System.out.println("Result: " + result);
            }

        } while (choice != 2);

        System.out.println("Program exited successfully.");
        scanner.close();
    }
}