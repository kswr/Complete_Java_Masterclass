package com.company;

public class Car extends Vehicle {
    private int numberOfDoors;
    private int numberOfCylinders;
    private String engineType;
    private String color;
    private int numberOfWheels;
    private int numberOfGears;
    private int currentGear;

    public Car(int numberOfSeats, int size, int maxSpeed, int numberOfDoors, int numberOfCylinders, String engineType, String color, int numberOfWheels, int numberOfGears) {
        super(numberOfSeats, size, "metal", maxSpeed);
        this.numberOfDoors = numberOfDoors;
        this.numberOfCylinders = numberOfCylinders;
        this.engineType = engineType;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.numberOfGears = numberOfGears;
        this.currentGear = 0;
    }

    public void gearUp(int amount){
        System.out.println("Current gear is " + this.currentGear);
        if ((this.currentGear + amount)<=this.numberOfGears) {
            this.currentGear += amount;
            System.out.println("Gear after switch is " + this.currentGear);
        } else {
            System.out.println("Gear can't be switched that high!");
        }
    }

    public void gearDown(int amount) {
        System.out.println("Current gear is " + this.currentGear);
        if ((this.currentGear - amount)>=0) {
            this.currentGear -= amount;
            System.out.println("Gear after switch is " + this.currentGear);
        } else {
            System.out.println("Gear can't be switched that low!");
        }
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}

