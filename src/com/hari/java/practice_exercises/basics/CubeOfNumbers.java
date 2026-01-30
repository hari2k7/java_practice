package com.hari.java.practice_exercises.basics;
import java.util.Scanner;
public class CubeOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of terms :");
        int n = scanner.nextInt();

        for(int i=1;i<n+1;i++) {
            System.out.println("Number is: "+i+" and cube of the "+i+" is:"+(i*i*i));
        }

        scanner.close();
    }
}
