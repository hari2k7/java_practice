package com.hari.java.miniprojects.management;

import java.util.Scanner;

/*
 * Mini Project: Cricket Manager
 * Demonstrates OOP, arrays, and menu-driven system
 */

class Cricketer {

    private String name;
    private String country;
    private int age;

    public Cricketer(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public void displayProfile() {
        System.out.println(name + " (" + country + ") - Age: " + age);
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }
}

public class CricketManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many cricketers do you want to add? : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Cricketer[] players = new Cricketer[n];

        // Input players
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Player " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Country: ");
            String country = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            players[i] = new Cricketer(name, country, age);
        }

        int choice;

        do {
            System.out.println("\n--- Cricket Manager ---");
            System.out.println("1. Search by Country");
            System.out.println("2. Players above Age 35");
            System.out.println("3. Display All Players");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter country name: ");
                    String searchCountry = scanner.nextLine();
                    boolean found = false;

                    for (Cricketer player : players) {
                        if (player.getCountry().equalsIgnoreCase(searchCountry)) {
                            player.displayProfile();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No players found from " + searchCountry);
                    }
                    break;

                case 2:
                    System.out.println("Players above 35 years:");
                    boolean ageFound = false;

                    for (Cricketer player : players) {
                        if (player.getAge() > 35) {
                            player.displayProfile();
                            ageFound = true;
                        }
                    }

                    if (!ageFound) {
                        System.out.println("No players above 35.");
                    }
                    break;

                case 3:
                    System.out.println("All Players:");
                    for (Cricketer player : players) {
                        player.displayProfile();
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}