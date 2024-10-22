package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int numberOfBeds, double price, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
        this.isAvailable = isAvailable;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void checkIn() {
        if (isAvailable()) {
            isOccupied = true;
            isDirty = true;
            System.out.println("Enjoy your stay!");
        } else {
            System.out.println("Sorry, room unavailable.");
        }
    }
    public void checkOut() {
        if (isOccupied == true) {
            isOccupied = false;
            System.out.println("Thank you for choosing Hotel. Safe travels!");
        } else
            System.out.println("Room not currently occupied.");

    }
    public void cleanRoom() {
        if (isOccupied == false && isDirty == true) {
            isDirty = true;
        }
    }
}
