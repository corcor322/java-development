package com.pluralsight;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheatreReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String date = "";
        int ticketNum ="";

        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        date = date.parse(date, formatter);
        System.out.println(date);



        // Ask users name
        // Ask date
        // Ask # of tickets needed
        // if 2 or more tickets reserved, return number tickets reserved
        // if 1 return 1 ticket reserved
    }

    public static String returnDate(Scanner scanner, String date, DateTimeFormatter formatter) {

    }
}
