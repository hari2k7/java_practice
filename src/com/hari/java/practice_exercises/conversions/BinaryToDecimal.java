package com.hari.java.practice_exercises.conversions;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binary, decimal = 0, base = 1;

        System.out.print("Input a binary number: ");
        binary = sc.nextInt();

        int temp = binary;

        for (; temp > 0; temp = temp / 10) {
            int lastDigit = temp % 10;
            decimal = decimal + lastDigit * base;
            base = base * 2;
        }

        System.out.println("The Binary Number : " + binary);
        System.out.println("The equivalent Decimal Number : " + decimal);
    }
}