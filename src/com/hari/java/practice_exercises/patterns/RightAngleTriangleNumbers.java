package com.hari.java.practice_exercises.patterns;

import java.util.Scanner;

public class RightAngleTriangleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = scanner.nextInt();

        for(int i=1; i<r+1; i++) {
            for(int j=1; j<i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        scanner.close();
    }
}
