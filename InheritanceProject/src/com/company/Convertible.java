package com.company;

public class Convertible extends Car{
    private boolean hardtop;
    private boolean folded;

    public Convertible(int numberOfSeats, int size, int maxSpeed, int numberOfDoors, int numberOfCylinders, String engineType, String color, int numberOfWheels, int numberOfGears, boolean hardtop) {
        super(numberOfSeats, size, maxSpeed, numberOfDoors, numberOfCylinders, engineType, color, numberOfWheels, numberOfGears);
        this.hardtop = hardtop;
        this.folded = true;
    }

    public void fold(){
       this.folded = true;
        System.out.println("Roof is now folded");
    }

    public void unfold(){
        this.folded = false;
        System.out.println("Roof is now unfolded");
    }

    public boolean isHardtop() {
        return hardtop;
    }

    public boolean isFolded() {
        return folded;
    }
}
