package com.hari.java.practice_exercises.patterns;

import java.util.Scanner;

public class RepeatedNumberPyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = scanner.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(i+" ");
            }System.out.println();
        }

        scanner.close();
    }
}
