package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask for name
            System.out.print("Please enter your name: ");
            String input = scanner.nextLine();

            // Store the first, middle & and last names in variables
            String first = "";
            String middle = "";
            String last = "";

            // Find the first space
            int firstSpaceIndex = input.indexOf(' ');

            if (firstSpaceIndex == -1) {
                first = input;
                last = input;
         /*   System.out.println("Name format is wrong");
            return;*/
            } else {
                first = input.substring(0, firstSpaceIndex);

                input = input.substring(firstSpaceIndex).trim();

                int lastSpaceIndex = input.indexOf(' ');

                if (lastSpaceIndex == -1) {
                    last = input;
                } else {
                    middle = input.substring(0, lastSpaceIndex);
                    last = input.substring(lastSpaceIndex + 1);
                }
            }

            // Display divided name parts
            System.out.println("First name: " + first);
            System.out.println("Middle name: " + (middle.isEmpty() ? "(none)" : middle));
            System.out.println("Last name: " + last);

            scanner.close();
        }
}
