package com.hari.java.practice_exercises.series;
import java.util.Scanner;
public class Series_9_99_999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int sum = 0;
        int term = 0;
        for(int i=1; i<=n;i++) {
            term = term*10+9;
            System.out.print(term);
            if(i<n) {
                System.out.print(" + ");
            }
            sum += term;
        }
        System.out.print("\nThe sum of the series = "+sum);
        sc.close();
    }
}
