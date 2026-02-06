package com.hari.java.practice_exercises.patterns;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inputnumber of rows: ");
        int r = sc.nextInt();

        for(int i=0; i<r; i++) {
            for(int j=0; j<r-i; j++) {
                System.out.print(" ");
            }

            int n = 1;

            for(int k=0; k<=i; k++) {
                System.out.print(n + " ");
                n = n*(i-k)/(k+1);
            }System.out.println();
        }

        sc.close();
    }
}
