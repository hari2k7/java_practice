package com.hari.java.practice_exercises.loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number (Table to be calculated): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            scanner.close();
            return;
        }

        int n = scanner.nextInt();

        System.out.println("Multiplication Table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " × " + i + " = " + (n * i));
        }

        scanner.close();
    }
}
