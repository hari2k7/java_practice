package com.hari.java.miniprojects.utilities;
import java.util.Scanner;
public class MatrixOperationsProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n--- Matrix Operations Program ---");
            System.out.println("1. Matrix Addition");
            System.out.println("2. Matrix Subtraction");
            System.out.println("3. Matrix Transpose");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch(choice) {
            case 1:{
            	matrixAddition(scanner);
            	break;
            }
            
            case 2:{
            	matrixSubtraction(scanner);
            	break;
            }
            
            case 3:{
            	matrixTranspose(scanner);
            	break;
            }
            
            case 4:
            	System.out.println("Exiting Program...");
            	break;
            	
            default:
            	System.out.println("Invalid choice. Try Again");
            }
		}while(choice != 4);
	}
	
	private static void matrixAddition(Scanner scanner) {
		System.out.print("Enter number of rows: ");
		int rows = scanner.nextInt();
		
		System.out.print("Enter number of colomns: ");
		int cols = scanner.nextInt();
		
		int[][] a = new int[rows][cols];
		int[][] b = new int[rows][cols];
		int[][] sum = new int[rows][cols];
		
		System.out.println("Enter elements of first matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter elements of second matrix: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				b[i][j]=scanner.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0; j<cols;j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Resultant matrix: ");
		printMatrix(sum);
	}
	
	private static void matrixSubtraction(Scanner scanner) {
		System.out.print("Enter number of rows: ");
		int rows = scanner.nextInt();
		
		System.out.print("Enter number of colomns: ");
		int cols = scanner.nextInt();
		
		int[][] a = new int[rows][cols];
		int[][] b = new int[rows][cols];
		int[][] diff = new int[rows][cols];
		
		System.out.println("Enter elements of first matrix: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter elements of second matrix: ");
		for(int i=0;i<rows;i++) {
			for(int j=0; j<cols;j++) {
				b[i][j]=scanner.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0; j<cols;j++) {
				diff[i][j] = a[i][j] - b[i][j];
			}
		}
		System.out.println("Resultant matrix: ");
		printMatrix(diff);
		
	}
	
	private static void matrixTranspose(Scanner scanner) {
		System.out.print("Enter number of rows: ");
		int rows = scanner.nextInt();
		
		System.out.print("Enter number of colomns: ");
		int cols = scanner.nextInt();
		
		int[][] a = new int[rows][cols];
		int[][] transpose = new int[cols][rows];
		
		System.out.println("Enter elements of matrix: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0; j<cols; j++) {
				transpose[j][i] = a[i][j];
			}
		}
		System.out.println("Transpose of the matrix: ");
		printMatrix(transpose);
		
	}
	
	private static void printMatrix(int[][] matrix) {
		for(int[] rows : matrix) {
			for(int val : rows) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

}
