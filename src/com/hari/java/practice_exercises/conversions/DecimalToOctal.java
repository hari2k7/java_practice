package com.hari.java.practice_exercises.conversions;

import java.util.Scanner;

/*
 * Program to convert a decimal number to octal
 */
public class DecimalToOctal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = scanner.nextInt();

        int temp = number;
        int octal = 0;
        int place = 1;

        while (number > 0) {
            int remainder = number % 8;
            octal += remainder * place;
            place *= 10;
            number /= 8;
        }

        System.out.println("Octal representation of " + temp + " is: " + octal);

        scanner.close();
    }
}
