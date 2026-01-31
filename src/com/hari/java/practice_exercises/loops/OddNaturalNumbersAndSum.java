package com.hari.java.practice_exercises.loops;

import java.util.Scanner;

public class OddNaturalNumbersAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int n = scanner.nextInt();

        int sum = 0;

        System.out.println("The odd numbers are:");
        for (int i = 1; i <= n; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd + " ");
            sum += odd;
        }

        System.out.println("\nThe Sum of odd Natural Number upto " + n + " terms: " + sum);

        scanner.close();
    }
}
