package com.hari.java.practice_exercises.series;

import java.util.Scanner;

/*
 * Program to print square numbers up to N terms
 * and calculate their sum
 */
public class SquareNumberSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int sum = 0;

        System.out.print("Square numbers up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
            sum += square;
        }

        System.out.println("\nSum of square numbers up to " + n + " terms = " + sum);

        scanner.close();
    }
}
