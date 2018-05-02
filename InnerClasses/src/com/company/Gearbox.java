package com.company;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears = new ArrayList<>();
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        Gear neutral = new Gear(0, 0.0d);
        this.gears.add(neutral);
        for (int i = 0; i < this.maxGears; i++) {
           addGear(i, i*5.3d);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if((number > 0) && (number <= this.maxGears)){
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void switchGear(int number) {
        if ((number >0) && (number <= this.maxGears) && this.clutchIsIn){
            this.currentGear = number;
            System.out.println("Gear " + number + " selected");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if(clutchIsIn){
            System.out.println("Scream!");
            return 0.0d;
        } else {
            return revs * gears.get(currentGear).getRatio();
        }
    }

    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs *(this.ratio);
        }

        public double getRatio() {
            return ratio;
        }

        //        public int operations() {
//            return (2^this.gearNumber);
//        }
    }

    public ArrayList<Gear> getGears() {
        return gears;
    }

    public int getMaxGears() {
        return maxGears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public boolean isClutchIsIn() {
        return clutchIsIn;
    }
}
