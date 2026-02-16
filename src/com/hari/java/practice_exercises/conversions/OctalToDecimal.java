package com.hari.java.practice_exercises.conversions;

import java.util.Scanner;

/*
 * Program to convert an octal number to decimal
 */
public class OctalToDecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an octal number (digits 0-7 only): ");
        long octal = scanner.nextLong();

        long temp = octal;
        int decimal = 0;
        int base = 1;  // 8^0

        while (temp > 0) {
            int digit = (int) (temp % 10);
            decimal += digit * base;
            base *= 8;
            temp /= 10;
        }

        System.out.println("Octal Number: " + octal);
        System.out.println("Equivalent Decimal Number: " + decimal);

        scanner.close();
    }
}
