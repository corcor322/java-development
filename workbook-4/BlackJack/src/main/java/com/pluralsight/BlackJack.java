package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get player info
        System.out.println("Enter the number of players:");
        int numOfPlayers = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> playerNames = new ArrayList<>();
        ArrayList<Hand> playerHands = new ArrayList<>();

        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Enter the name of Player " + (i + 1) +":");
            String playerName = scanner.nextLine();
            playerNames.add(playerName);
            playerHands.add(new Hand());
        }
        // Shuffle deck
        Deck deck = new Deck();
        deck.shuffle();

        // Deal players
        for (Hand hand : playerHands) {
            hand.deal(deck.deal());
            hand.deal(deck.deal());
        }
        // Display hand
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println(playerNames.get(i) + "'s hand:");
            System.out.println(playerHands.get(i));
            System.out.println("Total Value: " + playerHands.get(i).getValue());
        }
    }
}
