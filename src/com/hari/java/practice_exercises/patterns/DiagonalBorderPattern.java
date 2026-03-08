package com.hari.java.practice_exercises.patterns;

import java.util.Scanner;

public class DiagonalBorderPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j || j==n-i+1 || j==1 || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }

        scanner.close();
    }
}
