package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        // First name, is there a middle name?, Last name, is there a suffix?

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String first = scanner.nextLine();

        System.out.println("Enter Middle Name");
        String middle = scanner.nextLine();

        System.out.println("Enter Last Name");
        String last = scanner.nextLine();

        System.out.println("Enter Suffix");
        String suffix = scanner.nextLine();

        String fullName = first;

        if (!middle.isEmpty()) {
            fullName += " " + middle;
        }

        fullName += " " + last;

        if (!suffix.isEmpty()) {
            fullName += "," + suffix;
        }

        System.out.println("Full name: " + fullName);
    }
    // public static String getInput(Scanner scanner);
}
