package com.hari.java.practice_exercises.numbers;

import java.util.Scanner;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input starting number of range: ");
        int start = sc.nextInt();

        System.out.print("Input ending number of range: ");
        int end = sc.nextInt();

        System.out.print("Armstrong numbers in given range are: ");

        for (int i = start; i <= end; i++) {
            int num = i;
            int originalNum = i;
            int sum = 0;
            int digits = 0;

            // Count digits
            while (num != 0) {
                digits++;
                num /= 10;
            }

            num = i;

            // Calculate Armstrong sum
            while (num != 0) {
                int rem = num % 10;
                sum += Math.pow(rem, digits);
                num /= 10;
            }

            // Check Armstrong
            if (sum == originalNum) {
                System.out.print(originalNum + " ");
            }
        }

        sc.close();
    }
}
