package com.hari.java.practice_exercises.basics;

public class SumOfFirst10NaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("The first 10 natural number is : ");
        for(int i=1;i<=10;i++) {
            System.out.print(i+" ");
            sum += i;
        }
        System.out.print("\nThe Sum is: "+sum);
    }
}
