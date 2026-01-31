package com.hari.java.practice_exercises.loops;

import java.util.Scanner;

public class VerticalMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input up to the table number starting from 1: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            scanner.close();
            return;
        }

        int n = scanner.nextInt();

        System.out.println("Multiplication Table from 1 to " + n);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " × " + i + " = " + (i * j));
                if (j < n) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
