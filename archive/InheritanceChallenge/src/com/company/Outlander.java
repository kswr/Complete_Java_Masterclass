package com.company;

public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super(10, "black", 200, 8, 4, 4, 5, "Toyota", "Outlader", "Diesel");
        this.roadServiceMonths = roadServiceMonths;
    }
}
