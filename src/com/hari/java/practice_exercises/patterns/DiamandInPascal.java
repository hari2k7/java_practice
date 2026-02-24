package com.hari.java.practice_exercises.patterns;
import java.util.Scanner;
public class DiamandInPascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            int row;
            if (i <= n) {
                row = i;
            } else {
                row = 2 * n - i;
            }
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print(j);
            }
            for (int j = row - 1; j >= 1; j--) {
                System.out.print(j);
            }System.out.println();
        }
        sc.close();
    }
}
