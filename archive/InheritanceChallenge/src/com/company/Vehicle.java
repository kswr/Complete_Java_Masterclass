package com.company;

public class Vehicle {
    private int size;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    public Vehicle(int size, String color, int maxSpeed) {
        this.size = size;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public void move() {
        System.out.println("Vehicle.move() called");
        System.out.println("Vehicle moves at speed " + this.currentSpeed);
    }

    public void turnLeft() {
        System.out.println("Vehicle.turnLeft() called");
        System.out.println("Vehicle turns left");
    }

    public void turnRight() {
        System.out.println("Vehicle.turnRight() called");
        System.out.println("Vehicle turns left");
    }

    public void speedUp(int speed) {
        if (this.currentSpeed + speed <= maxSpeed) {
            this.currentSpeed += speed;
            System.out.println("Vehicle sped up " + speed);
        } else {
            System.out.println("Vehicle can't get any faster");
        }
        System.out.println("Vehicle now moves at " + this.currentSpeed);
    }

    public void slowDown(int speed) {
        if (this.currentSpeed - speed > 0) {
            this.currentSpeed -= speed;
            System.out.println("Vehicle slow down " + speed);
        } else {
            this.currentSpeed = 0;
            System.out.println("Vehicle stopped");
        }
    }
}
