package com.hari.java.practice_exercises.numbers;

import java.util.Scanner;

/*
 * Program to check whether a number is a Perfect Number
 * A perfect number is equal to the sum of its proper divisors
 */
public class PerfectNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive number.");
            scanner.close();
            return;
        }

        int sum = 0;

        System.out.print("Proper divisors: ");
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\nSum of divisors: " + sum);

        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }

        scanner.close();
    }
}
