package com.pluralsight;

import java.util.Scanner;

public class Sandwich {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the size
        System.out.println("What size sandwich would you like (press 1 for regular, 2 for large)?");
        String size = scanner.nextLine();

        // Ask for age
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        // Initialize price
        double price = 0.0;
        if (size.equals("1")) {
            price = 5.45;
        }
        else if (size.equals("2")) {
            price = 8.95;
        }
        else {
            System.out.println("Invalid command.");
            return;  // Exit if invalid size
        }

        // Apply 10% discount for under 18 & 20% discount for over 64
        if (age <= 17) {
            price = price * 0.90;  // 10% discount
            System.out.println("A 10% discount has been applied.");
        }
        else if (age >= 65) {
            price = price * 0.80;  // 20% discount
            System.out.println("A 20% discount has been applied.");
        }

        // Print final price
        System.out.printf("Your total is $%.2f%n", price);
    }
}