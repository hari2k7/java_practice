package com.hari.java.practice_exercises.patterns;

public class NumberPyramid {
    public static void main(String[] args){

        int n = 1;
        int r = 4;
        for(int i=1; i<=r; i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(n+" ");
                n++;
            }System.out.println();

        }
    }
}
