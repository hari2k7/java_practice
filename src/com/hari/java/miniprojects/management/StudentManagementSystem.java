package com.hari.java.miniprojects.management;

import java.util.Scanner;
public class StudentManagementSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter maximum number of students: ");
        int maxStudents = scanner.nextInt();
        int count = 0;

        int[] rollNo = new int[maxStudents];
        String[] name = new String[maxStudents];
        int[][] marks = new int[maxStudents][3];

        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    if (count >= maxStudents) {
                        System.out.println("Student limit reached.");
                        break;
                    }

                    System.out.print("Enter Roll Number: ");
                    rollNo[count] = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    name[count] = scanner.nextLine();

                    System.out.print("Enter marks for 3 subjects: ");
                    for (int i = 0; i < 3; i++) {
                        marks[count][i] = scanner.nextInt();
                    }

                    count++;
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No student records found.");
                        break;
                    }

                    for (int i = 0; i < count; i++) {
                        int total = 0;

                        for (int j = 0; j < 3; j++) {
                            total += marks[i][j];
                        }

                        double average = total / 3.0;
                        char grade;

                        if (average >= 80)
                            grade = 'A';
                        else if (average >= 60)
                            grade = 'B';
                        else if (average >= 40)
                            grade = 'C';
                        else
                            grade = 'F';

                        System.out.println("\nRoll No: " + rollNo[i]);
                        System.out.println("Name: " + name[i]);
                        System.out.println("Total Marks: " + total);
                        System.out.println("Average: " + average);
                        System.out.println("Grade: " + grade);
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}