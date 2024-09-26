package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter weekly hours worked: ");
        double hours = scanner.nextDouble();
        System.out.print("Enter your hourly wage: ");
        double wage = scanner.nextDouble();

        double grossPay = hours * wage;

        System.out.printf("%s $%.2f", name, grossPay);
    }
}
