package com.hari.java.practice_exercises.patterns;

import java.util.Scanner;

public class RightAngleTriangleStars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = scanner.nextInt();

        for(int i=1; i<r+1; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
