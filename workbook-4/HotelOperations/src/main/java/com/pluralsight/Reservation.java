package com.pluralsight;
//TODO: Add constructor with if/else condition for price
public class Reservation {
    private String roomType;
    private double price;
    private boolean isWeekend;
    private int numberOfNights;

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
