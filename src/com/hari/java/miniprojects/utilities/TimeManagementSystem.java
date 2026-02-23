package com.hari.java.miniprojects.utilities;

import java.util.Scanner;

/*
 * Mini Project: Time Management System
 * Demonstrates OOP concepts, constructors, static methods, and countdown timer
 */

class Timer {

    private int hours;
    private int minutes;
    private int seconds;

    // Default constructor
    public Timer() {
        this(0, 0, 0);
    }

    // Parameterized constructor
    public Timer(int h, int m, int s) {
        setTime(h, m, s);
    }

    // Set time with validation
    public void setTime(int h, int m, int s) {

        if (h < 0 || m < 0 || s < 0 || m >= 60 || s >= 60) {
            System.out.println("Invalid time format. Setting to 00:00:00.");
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        } else {
            this.hours = h;
            this.minutes = m;
            this.seconds = s;
        }
    }

    public void showTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    // Compute duration between two times
    public static Timer computeDuration(Timer start, Timer end) {

        int h = end.hours - start.hours;
        int m = end.minutes - start.minutes;
        int s = end.seconds - start.seconds;

        if (s < 0) {
            s += 60;
            m--;
        }

        if (m < 0) {
            m += 60;
            h--;
        }

        if (h < 0) {
            System.out.println("End time must be after start time.");
            return new Timer(0, 0, 0);
        }

        return new Timer(h, m, s);
    }

    // Countdown alarm
    public void setAlarm() {

        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        if (totalSeconds <= 0) {
            System.out.println("Invalid alarm time.");
            return;
        }

        System.out.println("Countdown:");

        while (totalSeconds >= 0) {

            int h = totalSeconds / 3600;
            int m = (totalSeconds % 3600) / 60;
            int s = totalSeconds % 60;

            System.out.printf("%02d:%02d:%02d\n", h, m, s);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted.");
            }

            totalSeconds--;
        }

        System.out.println("ALARM: Time is up!");
    }
}

public class TimeManagementSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Timer currentTime = new Timer();

        int choice;

        do {
            System.out.println("\n===== TIME MANAGEMENT SYSTEM =====");
            System.out.println("1. Set Time");
            System.out.println("2. Display Time");
            System.out.println("3. Compute Duration");
            System.out.println("4. Set Alarm");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Time (H M S): ");
                    currentTime.setTime(
                            scanner.nextInt(),
                            scanner.nextInt(),
                            scanner.nextInt());
                    break;

                case 2:
                    System.out.print("Current Time: ");
                    currentTime.showTime();
                    break;

                case 3:
                    System.out.print("Enter Start Time (H M S): ");
                    Timer start = new Timer(
                            scanner.nextInt(),
                            scanner.nextInt(),
                            scanner.nextInt());

                    System.out.print("Enter End Time (H M S): ");
                    Timer end = new Timer(
                            scanner.nextInt(),
                            scanner.nextInt(),
                            scanner.nextInt());

                    Timer duration = Timer.computeDuration(start, end);

                    System.out.print("Duration: ");
                    duration.showTime();
                    break;

                case 4:
                    System.out.print("Enter Alarm Time (H M S): ");
                    Timer alarm = new Timer(
                            scanner.nextInt(),
                            scanner.nextInt(),
                            scanner.nextInt());

                    alarm.setAlarm();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        scanner.close();
    }
}