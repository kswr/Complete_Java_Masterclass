package com.company;

public class Sedan extends Car{
    private String type;

    public Sedan(String color, int maxSpeed, int gears, String brand, String model, String engine) {
        super(1, color, maxSpeed, gears, 5, 4, 5, brand, model, engine);
        this.type = "Sedan";
    }



}
