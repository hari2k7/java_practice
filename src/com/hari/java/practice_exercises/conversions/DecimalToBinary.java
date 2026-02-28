package com.hari.java.practice_exercises.conversions;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = scanner.nextInt();

        int bin = 0;
        int place = 1;

        while(n>0){
            int r = n%2;
            bin = bin + r * place;
            place *= 10;
            n /= 2;
        }

        System.out.println("Binary number equivalent to said decimal number is: " + bin);

        scanner.close();
    }
}
