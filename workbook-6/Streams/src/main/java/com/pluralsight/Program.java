package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // Initialize the list of people
        ArrayList<Person> people = initializePeople();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do? Enter a number:");
        System.out.println("1- Search by first name.");
        System.out.println("2- Search by last name.");
        int menuChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Perform the search based on the user's choice
        Program program = new Program(); // Create an instance to call the non-static methods

        if (menuChoice == 1) {
            System.out.print("Enter the first name to search: ");
            String firstName = scanner.nextLine();
            ArrayList<Person> firstNameResults = program.searchFirstName(people, firstName);
            printResults(firstNameResults);
        } else if (menuChoice == 2) {
            System.out.print("Enter the last name to search: ");
            String lastName = scanner.nextLine();
            ArrayList<Person> lastNameResults = program.searchLastName(people, lastName);
            printResults(lastNameResults);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static ArrayList<Person> initializePeople() {
        // Populate and return a list of people
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Kia", "Sedona", 32));
        people.add(new Person("Satoru", "Gojo", 28));
        people.add(new Person("Corcor", "Sillypants", 29));
        people.add(new Person("Cam", "Ra", 29));
        people.add(new Person("Maven", "Mirinesse", 3));
        people.add(new Person("Nila", "Kitty", 7));
        people.add(new Person("Patrick", "Star", 50));
        people.add(new Person("Armin", "Fakename", 40));
        people.add(new Person("Carmen", "San Diego", 105));
        people.add(new Person("Matisaurus", "Rex", 26));
        return people;
    }

    public ArrayList<Person> searchFirstName(ArrayList<Person> people, String firstName) {
        ArrayList<Person> results = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                results.add(person);
            }
        }

        return results;
    }

    public ArrayList<Person> searchLastName(ArrayList<Person> people, String lastName) {
        ArrayList<Person> results = new ArrayList<>();
        for (Person person : people) {
            if (person.getLastName().equalsIgnoreCase(lastName)) {
                results.add(person);
            }
        }
        return results;
    }

    // Utility method to print the search results
    private static void printResults(ArrayList<Person> results) {
        if (results.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            for (Person person : results) {
                System.out.println(person);
            }
        }
    }

    public double calculateAverageAge(ArrayList<Person> people) {
        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        return people.isEmpty() ? 0 : (double) totalAge / people.size();
    }

    public Person getOldestPerson(ArrayList<Person> people) {
        Person oldest = null;
        for (Person person : people) {
            if (oldest == null || person.getAge() > oldest.getAge()) {
                oldest = person;
            }
        }
        System.out.println(oldest);
        return oldest;
    }

    public Person getYoungestPerson(ArrayList<Person> people) {
        Person youngest = null;
        for (Person person : people) {
            if (youngest == null || person.getAge() < youngest.getAge()) {
                youngest = person;
            }
        }
        System.out.println(youngest);
        return youngest;

    }
}

