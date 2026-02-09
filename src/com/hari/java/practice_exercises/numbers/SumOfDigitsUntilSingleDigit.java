package com.hari.java.practice_exercises.numbers;

import java.util.Scanner;

/*
 * Program to reduce a number to a single digit
 * by repeatedly summing its digits (Math approach)
 */
public class SumOfDigitsUntilSingleDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        while (n > 9) {
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            n = sum;
        }

        System.out.println("Single digit result: " + n);
        scanner.close();
    }
}
