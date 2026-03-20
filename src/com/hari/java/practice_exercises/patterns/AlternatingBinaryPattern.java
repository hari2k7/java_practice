package com.hari.java.practice_exercises.patterns;

import java.util.Scanner;

public class AlternatingBinaryPattern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = scanner.nextInt();

        int n = 1;

        for(int i=1; i<=r;i++){
            for(int j=1; j<=i; j++){
                System.out.print(n);
                if(n==1){
                    n=0;
                }else{
                    n=1;
                }
            }System.out.println();
        }

        scanner.close();
    }
}
