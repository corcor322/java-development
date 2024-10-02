package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ask the user for their full name
        System.out.println("Please enter your full name");
        String fullName = scanner.nextLine();

        // ask break the full name up by spaces
        // if allNames has an index of 2:
        //  -set 0= firstname 1=middle name 2=lastname
        //  -print firstname, print middle name, print last name
        // else if allNames has an index of 1
        //  -set 0= firstname 1=lastname
        //  -print firstname, print middle name, print last name
        String[] allNames = fullName.split(" ");
        System.out.println(Arrays.toString(allNames));

        if (allNames[] == 2); {
            String firstName = allNames[0];
            String middleName =
        }
        // if there's three names, break into first, middle and last name
        //if (allNames) {
        // if there's two names break into first and last name

        // if there's one name print "invalid structure"
    }
}
