package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private boolean isWeekend;
    private int numberOfNights;
    //Room type can be king or double
    //king is 139pnight double is 124pnight
    //if over weekend increase price by 10%

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    public double getReservationTotal() {
        if (isWeekend = false) {
            return numberOfNights * price;
        } else
            return numberOfNights * price * 1.1;
        // reservations total = ?
    }
}
