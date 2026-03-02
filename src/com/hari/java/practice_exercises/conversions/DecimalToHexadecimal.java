package com.hari.java.practice_exercises.conversions;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter decimal value: ");
        int decimal = scanner.nextInt();

        String hex = "";

        while (decimal > 0) {
            int rem = decimal % 16;
            if (rem < 10)
                hex = rem + hex;
            else
                hex = (char)(rem - 10 + 'A') + hex;

            decimal = decimal / 16;
        }

        System.out.println(hex);
    }
}
