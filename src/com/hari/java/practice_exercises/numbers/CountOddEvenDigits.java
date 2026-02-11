package com.hari.java.practice_exercises.numbers;

import java.util.Scanner;

/*
 * Program to count odd and even digits in a number
 * and calculate their respective sums
 */
public class CountOddEvenDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int evenCount = 0, oddCount = 0;
        int evenSum = 0, oddSum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                evenCount++;
                evenSum += digit;
            } else {
                oddCount++;
                oddSum += digit;
            }

            n /= 10;
        }

        System.out.println("Number of even digits = " + evenCount);
        System.out.println("Number of odd digits  = " + oddCount);
        System.out.println("Sum of even digits    = " + evenSum);
        System.out.println("Sum of odd digits     = " + oddSum);

        scanner.close();
    }
}
