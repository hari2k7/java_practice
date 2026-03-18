package com.hari.java.practice_exercises.patterns;

import java.util.Scanner;

public class SandClockPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows (greater than 3): ");
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if((j>=i && j<=n-i+1) || (j<=i && j>=n-i+1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }

        scanner.close();
    }
}
