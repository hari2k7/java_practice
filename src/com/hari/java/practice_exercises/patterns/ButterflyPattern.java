package com.hari.java.practice_exercises.patterns;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= 2 * n; i++){
            for(int j = 1; j <= 2 * n; j++){

                if(i <= n){
                    if((j <= i || j > 2*n - i)){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if((j <= 2*n - i + 1 || j >= i)){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

            }
            System.out.println();
        }

        scanner.close();
    }
}