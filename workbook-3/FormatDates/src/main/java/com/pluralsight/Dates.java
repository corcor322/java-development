package com.pluralsight;
//TODO: Add challenge and GMT

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        // Get date
        LocalDate date = LocalDate.now();

        // Print date in mm/dd/yyyy format
        DateTimeFormatter monthFirstNumb = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(date.format(monthFirstNumb));

        //Print date in yyyy-mm-dd format
        System.out.println(date);

        //Print date in Month, d, yyyy format
        DateTimeFormatter monthFirstFull = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println(date.format(monthFirstFull));

        //Print date in Day of week, Mon, d, yyyy format

    }
}
