package com.hari.java.practice_exercises.patterns;

import java.util.Scanner;

public class OddAsteriskPyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = scanner.nextInt();
        int n = 1;
        for(int i=1; i<=r; i++) {
            for (int j = 0; j < r - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*".repeat(n) + " ");
            System.out.println();
            n += 2;
        }
        scanner.close();
    }
}
