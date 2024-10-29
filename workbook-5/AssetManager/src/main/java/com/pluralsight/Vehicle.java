package com.pluralsight;
//TODO: Code switchcase
import java.time.LocalDate;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
        this.makeModel = "";
        this.year = 0;
        this.odometer = 0;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;
        double value = 0.0;

        // Code switchcase

        if (!makeModel.contains("Honda") || !makeModel.contains("Toyota") && odometer > 100000) {
            value = value * .75;
        }
        return value;

    }
}
