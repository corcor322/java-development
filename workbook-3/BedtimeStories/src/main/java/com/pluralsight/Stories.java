package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stories {
    public static void main(String[] args) {
        String[] files = {"goldilocks.txt", "hansel_and_gretel.txt", "mary_had_a_little_lamb.txt"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which story would you like to read?");
        System.out.println("Press '1' for 'Goldilocks and the Three Bears'");
        System.out.println("Press '2' for 'Hansel and Gretel'");
        System.out.println("Press '3' for 'Mary had a Little Lamb'");

        int input = scanner.nextInt();

        if (input >= 1 && input <= 3) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(files[input - 1])))) {
                String storyLine;
                // Read the file line by line
                while ((storyLine = reader.readLine()) != null) {
                    System.out.println(storyLine);
                }
            } catch (Exception exception) {
                System.out.println("Sorry, there was an error reading the file.");
            }
        } else {
            System.out.println("Sorry, that's not a valid choice. Please choose a number between 1 and 3.");
        }

        scanner.close();
    }
}
