package com.hari.java.practice_exercises.basics;
import java.util.Scanner;
public class SumAndAverageOf10Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Input the 10 numbers: ");
        for(int i=1; i<11; i++) {
            System.out.print("Number-"+i+":");
            sum += scanner.nextInt();
        }

        System.out.println("\nThe sum of 10 no is: "+sum);
        System.out.print("The Average is: "+sum/10);

        scanner.close();
    }
}
