package com.hari.java.practice_exercises.strings;

import java.util.Scanner;

/*
 * Program to reverse a string
 */
public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        System.out.print("Reversed word: ");

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }

        System.out.println();
        scanner.close();
    }
}
