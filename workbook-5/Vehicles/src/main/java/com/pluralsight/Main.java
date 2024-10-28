package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car penelope = new Car();
        penelope.setModel("Subaru Legacy");
        penelope.openTrunk();
        penelope.setColor("Teal");
        penelope.setTopSpeed(120);
        penelope.closeTrunk();

        SemiTruck honkHonk = new SemiTruck();
        honkHonk.loadCargo();
        honkHonk.unloadCargo();
        honkHonk.setCargoCapacity(50000);

        Hovercraft myHoverCraft = new Hovercraft();
        myHoverCraft.setNumberOfPassengers(4);
    }
}
