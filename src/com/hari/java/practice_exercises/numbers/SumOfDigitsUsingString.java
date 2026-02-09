package com.hari.java.practice_exercises.numbers;

import java.util.Scanner;

/*
 * Program to reduce a number to a single digit
 * by repeatedly summing its digits (String approach)
 */
public class SumOfDigitsUsingString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        while (n > 9) {
            String str = Integer.toString(n);
            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                sum += str.charAt(i) - '0';
            }

            n = sum;
        }

        System.out.println("Single digit result: " + n);
        scanner.close();
    }
}
