package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new cell phone
        CellPhone cellPhone1 = new CellPhone();

        Scanner scanner = new Scanner(System.in);

        // Get phone info from user
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();  // Read integer value
        cellPhone1.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        cellPhone1.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone1.setOwner(owner);

        scanner.close();

        // Display phone properties
        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner());
    }

}