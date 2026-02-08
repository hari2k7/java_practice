package com.hari.java.practice_exercises.numbers;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int n = sc.nextInt();
        int rev =0;

        while(n>0) {
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        System.out.print("The number in reversed order: "+rev);

        sc.close();
    }
}
