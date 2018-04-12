package com.company;

public class Car extends Vehicle{
    private int gears;
    private int currentGear;
    private int doors;
    private int wheels;
    private int seats;
    private String brand;
    private String model;
    private String engine;

    public Car(int size, String color, int maxSpeed, int gears, int doors, int wheels, int seats, String brand, String model, String engine) {
        super(size, color, maxSpeed);
        if (gears > 1) {
            this.gears = gears;
        } else {
            this.gears = 1;
        }
        this.currentGear = 1;
        this.doors = doors;
        this.wheels = wheels;
        this.seats = seats;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void gearUp() {
        if ((this.currentGear += 1) <= this.gears) {
            this.currentGear += 1;
            System.out.println("Gear switched up, current gear is " + this.currentGear);
        } else {
            System.out.println("Max gear reached");
        }
    }

    public void gearDown() {
        if (this.currentGear > 1) {
            this.currentGear -= 1;
            System.out.println("Gear switched down, current gear is " + this.currentGear);
        } else {
            System.out.println("Gear already at 1");
        }
    }


}
