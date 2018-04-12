package com.company;

public class Vehicle {
    private int numberOfSeats;
    private int size;
    private String mainMaterial;
    private int maxSpeed;
    private int currentSpeed;
    private double direction;

    public Vehicle(int numberOfSeats, int size, String mainMaterial, int maxSpeed) {
        this.numberOfSeats = numberOfSeats;
        this.size = size;
        this.mainMaterial = mainMaterial;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
        this.direction = 0d;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setMainMaterial(String mainMaterial) {
        this.mainMaterial = mainMaterial;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public void turn(double direction) {
        System.out.format("Initial direction is %.2f degrees%n", this.direction);
        System.out.printf("Vehicle is turning %.2f degrees%n", direction);
        this.direction += direction;
        System.out.format("Current direction is %.2f degrees%n", this.direction);
    }

    public void speedUp(int amount) {
        System.out.format("Current speed of vehicle is %d km/h%n", this.currentSpeed);
    }
}
