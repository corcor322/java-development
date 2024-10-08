package com.pluralsight;

//TODO: Update quotes, add loop to see more quotes, add random quote option

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String quotes[] = new String[10];

            quotes[0] = "You are not obligated to complete the work, but neither are you free to desist from it. -Pirkei Avot";
            quotes[1] = "If I am not for myself, then who will be for me? If am am not for others, what am I? - Rabbi Hillel";
            quotes[2] = "The superior man is distressed by the limitations of his ability; he is not distressed by the fact that men do not recognize the ability that he has. -Confucius";
            quotes[3] = "When you feel like";
            quotes[4] = "EVERYBODY DANCE NOW- Inumaki is a cursed speech user";
            quotes[5] = "Stand proud, you are strong.";
            quotes[6] = "Throughout Heaven and Earth, I alone am the honored one.";
            quotes[7] = "Maven";
            quotes[8] = "Maven";
            quotes[9] = "Maven";


            // Prompt user for number between 1-10
            System.out.println("Pick a number between 1 and 10.");
            int input = scanner.nextInt();

            // Display quote corresponding to that number
            System.out.println(quotes[input - 1]);
        } catch (Exception outOfBounds) {
            System.out.println("Hmm...that's not right.");

        }

    }
}