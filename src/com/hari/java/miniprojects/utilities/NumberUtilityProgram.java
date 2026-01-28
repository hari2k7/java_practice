package com.hari.java.miniprojects.utilities;
import java.util.Scanner;
public class NumberUtilityProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int choice;
        
        do {
        	System.out.println("\n--- Number Utility Program ---");
            System.out.println("1. Check Prime Number");
            System.out.println("2. Check Palindrome");
            System.out.println("3. Find Factorial");
            System.out.println("4. Reverse Number");
            System.out.println("5. Sum of Digits");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch(choice) {
            case 1:{
            	System.out.print("Enter a number: ");
            	int n = scanner.nextInt();
            	boolean isPrime = true;
            	
            	if(n<=1) {
            		isPrime = false;
            	}else {
            		for(int i=2;i<=n/2;i++) {
            			if(n%i == 0) {
            				isPrime = false;
            				break;
            			}
            		}
            	}
            	if(isPrime) {
            		System.out.print("The Given number "+n+" is prime number");
            	}else {
            		System.out.print("The given number "+n+" is not a prime number");
            	}
            	break;
            }
            	
            case 2:{
            	System.out.print("Enter a number: ");
            	int n = scanner.nextInt();
            	int temp = n;
            	int rev = 0;
            	
            	while(n>0) {
            		int digit = n%10;
            		rev = rev*10+digit;
            		n = n/10;
            	}
            	
            	if(temp == rev) {
            		System.out.print("The given number "+rev+" is Palindrome");
            	}else {
            		System.out.print("The given number "+temp+" is not Palindrome");
            	}
            	break;
            }
            
            case 3:{
            	System.out.print("Enter  a number: ");
            	int n = scanner.nextInt();
            	long fact = 1;
            	
            	for(int i=1;i<=n;i++) {
            		fact *= i;
            	}
            	System.out.print("Factorial of "+n+" is "+fact);
            	break;
            }
            
            case 4:{
            	System.out.print("Enter a number: ");
            	int n = scanner.nextInt();
            	int rev = 0;
            	while(n>0) {
            		int digit = n%10;
            		rev = rev*10+digit;
            		n /=10;
            	}
            	System.out.print("The reversed number is "+rev);
            	break;
            }
            
            case 5:{
            	System.out.print("Enter a number: ");
            	int n = scanner.nextInt();
            	int s = 0;
            	
            	while(n>0) {
            		s += n%10;
            		n /= 10;
            	}
            	System.out.print("Summ of digits is "+s);
            	break;
            }
            
            case 6:
            	System.out.println("Exiting program...");
                break;
            
            default:
            	System.out.println("Invalid choice. Try again.");
            	
            }
        	
        }while(choice != 6);
        
        
        scanner.close();    }
}
