package com.hari.java.practice_exercises.basics;
import java.util.Scanner;
public class NNaturalNumbersAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        int sum = 0;

        System.out.println("The first "+n+" natural number is: ");
        for(int i=1; i<n+1; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.print("\nThe Sum of Natural Number upto "+n+" terms: "+sum);

        scanner.close();
    }
}
