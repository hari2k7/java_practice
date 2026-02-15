package com.hari.java.practice_exercises.numbers;

import java.util.Scanner;

/*
 * Program to find the missing number in a sequence
 * from 1 to N using sum formula
 */
public class MissingNumberInSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = scanner.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int totalSum = n * (n + 1) / 2;
        int givenSum = 0;

        for (int num : arr) {
            givenSum += num;
        }

        int missingNumber = totalSum - givenSum;

        System.out.println("Missing number is: " + missingNumber);

        scanner.close();
    }
}
