package com.company;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;
    private boolean engineRunning;
    private int maxSpeed;

    public Car(String name, int cylinders, int maxSpeed) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.speed = 0;
        this.engineRunning = false;
        this.maxSpeed = maxSpeed;
    }

    public void startEngine() {
        System.out.println("Car engine is now starting");
        engineRunning = true;
        System.out.println("Engine is now running");
    }

    public void stopEngine() {
        if (speed==0) {
            System.out.println("Car engine is stopping");
            engineRunning = false;
            System.out.println("Engine is not running");
        } else {
            System.out.println("You need to slow down first");
        }
    }


    public void accelerate(int accelerate) {
        if (this.engineRunning) {
            if ((speed + accelerate) <= maxSpeed) {
                System.out.println("Car accelerates " + accelerate + " km/h");
                speed += accelerate;
                System.out.println("Speed of the car is now " + speed + " km/h");
            } else {
                System.out.println("Car accelerates to max speed");
                speed = maxSpeed;
                System.out.println("Car now goes with maximum speed of " + speed + " km/h");
            }
        } else {
            System.out.println("You need to start the engine first");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngineRunning(boolean engineRunning) {
        this.engineRunning = engineRunning;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void brake(int brake) {
        if (this.engineRunning) {
            if ((speed - brake) > 0) {
                System.out.println("Car slows down " + brake + " km/h");
                speed -= brake;
                System.out.println("Speed of the car is now " + speed + " km/h");
            } else {
                System.out.println("Car stops");
                speed = 0;
                System.out.println("Car is not moving");
            }
        } else {
            System.out.println("You need to start the engine first");
        }

    }




    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }
}

class Porsche extends Car {
    public Porsche(int cylinders, int maxSpeed) {
        super("Porsche", cylinders, maxSpeed);
    }
    public void brake(int brake) {
        if (this.isEngineRunning()) {
            if ((getSpeed() - brake) >0) {
                System.out.println("Porshe slows down " + brake + " km/h");
                int newSpeed = getSpeed() - brake;
                this.setSpeed(newSpeed);
                System.out.println("Speed of the porshe is now " + getSpeed() + " km/h");
            } else {
                System.out.println("Porsche stops");
                setSpeed(0);
                System.out.println("Porsche is not moving");
            }
        } else {
            System.out.println("You need to start the Porsche");
        }
    }

}


public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Basic Car", 6, 200);
        car1.accelerate(50);
        car1.startEngine();
        car1.accelerate(50);
        car1.accelerate(200);
        car1.stopEngine();
        car1.brake(50);
        car1.brake(200);
        car1.stopEngine();

        // polymorphism

        Porsche porsche1 = new Porsche(6,300);
        System.out.println(porsche1.getWheels());
        System.out.println(porsche1.isEngineRunning());
        porsche1.brake(10);
    }
}
