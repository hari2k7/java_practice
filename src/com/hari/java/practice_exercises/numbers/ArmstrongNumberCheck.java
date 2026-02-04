package com.hari.java.practice_exercises.numbers;

import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int sum = 0;
        int digits = 0;
        int temp = num;

        // Count number of digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;

        // Calculate Armstrong sum
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }

        // Check Armstrong
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        sc.close();
    }
}
