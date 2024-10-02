package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");
        System.out.println("Full name:");
        String fullName = scanner.nextLine();

        System.out.println("Billing Street:");
        String billStreet = scanner.nextLine();
        System.out.println("Billing City:");
        String billCity = scanner.nextLine();
        System.out.println("Billing State");
        String billState = scanner.nextLine();
        System.out.println("Billing Zip:");
        String billZip = scanner.nextLine();

        System.out.println("Shipping Street:");
        String shipStreet = scanner.nextLine();
        System.out.println("Shipping City:");
        String shipCity = scanner.nextLine();
        System.out.println("Shipping State");
        String shipState = scanner.nextLine();
        System.out.println("Shipping Zip:");
        String shipZip = scanner.nextLine();

        System.out.println(fullName + "\n");

        StringBuilder buildAddress = new StringBuilder();
        buildAddress.append("Billing Address: ").append("\n");
        buildAddress.append(billStreet).append("\n");
        buildAddress.append(billCity).append(", ");
        buildAddress.append(billState).append(" ");
        buildAddress.append(billZip).append("\n");
        String buildAddressResult = buildAddress.toString();
        System.out.println(buildAddressResult);

        StringBuilder shipAddress = new StringBuilder();
        shipAddress.append("Shipping Address:").append("\n");
        shipAddress.append(shipStreet).append("\n");
        shipAddress.append(shipCity).append(", ");
        shipAddress.append(shipState).append(" ");
        shipAddress.append(shipZip);
        String shipAddressResult = shipAddress.toString();
        System.out.println(shipAddressResult);
    }
}
