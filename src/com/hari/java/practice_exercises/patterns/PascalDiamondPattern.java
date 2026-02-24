package com.hari.java.practice_exercises.patterns;

import java.util.Scanner;

/*
 * Program to print Pascal's Triangle in Diamond Form
 */
public class PascalDiamondPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");
                num = num * (i - j) / (j + 1);
            }System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {

            int num = 1;

            for (int s = 0; s < n - i - 1; s++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");
                num = num * (i - j) / (j + 1);
            }System.out.println();
        }

        sc.close();
    }
}