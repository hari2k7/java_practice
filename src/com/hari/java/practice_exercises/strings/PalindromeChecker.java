package com.hari.java.practice_exercises.strings;

import java.util.Scanner;

/*
 * Program to check palindrome for both
 * numbers and strings using methods
 */
public class PalindromeChecker {
    public static boolean isStringPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isNumberPalindrome(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Palindrome Checker ---");
            System.out.println("1. Check String Palindrome");
            System.out.println("2. Check Number Palindrome");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter a string: ");
                    String str = scanner.nextLine();

                    if (isStringPalindrome(str)) {
                        System.out.println("It is a palindrome.");
                    } else {
                        System.out.println("Not a palindrome.");
                    }
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();

                    if (isNumberPalindrome(num)) {
                        System.out.println("It is a palindrome.");
                    } else {
                        System.out.println("Not a palindrome.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        scanner.close();
    }
}