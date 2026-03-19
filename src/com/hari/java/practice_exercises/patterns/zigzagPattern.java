package com.hari.java.practice_exercises.patterns;

public class zigzagPattern {
    public static void main(String[] args){

        for(int i=1; i<=3; i++){
            for(int j=1; j<=9; j++){
                if((i==1 &&(j==1 || j==5 || j==9)) || (i==2 && (j==2 || j==4 || j==6 || j==8)) || (i==3 && (j==3 || j==7))){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
