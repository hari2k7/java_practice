package com.hari.java.practice_exercises.patterns;

import java.util.Scanner;

public class AlphabetDiamond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int c = 1;
        char ch = (char) ('A' + c - 1);

        for(int i=1; i<= 2*n+1; i++){
            int r;
            if(i<=n){
                r = i;
            }else{
                r = 2*n-i;
            }
            for(int s =1; s<=n-r;s++){
                System.out.print(" ");
            }
            for(int j=1; j<=r; j++){
                System.out.print((char)('A' + j - 1));
            }
            for(int j=r-1; j>=1; j--){
                System.out.print((char)('A' + j - 1));
            }System.out.println();
        }


        sc.close();
    }
}
