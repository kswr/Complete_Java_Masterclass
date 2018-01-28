package com.company;

public class Main {

    public static void main(String[] args) {
    // Challenge.
    // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
    // Finally, create another class, a specific type of Car that inherits from the Car class.
    // You should be able to hand steering, changing gears, and moving (speed in other words).
    // You will want to decide where to put the appropriate state and behaviours (fields and methods).
    // As mentioned above, changing gears, increasing/decreasing speed should be included.
    // For you specific type of vehicle you will want to add something specific for that type of car.

        Sedan buick = new Sedan("red",250,6,"Chevrolet","Buick", "gas");
        Sedan a8 = new Sedan("blue", 270, 5, "Audi", "A8", "gas");

        a8.move();
        a8.speedUp(50);
        a8.gearUp();
        a8.speedUp(60);
        a8.gearUp();
        a8.speedUp(100);
        a8.gearUp();
        a8.speedUp(100);
        a8.slowDown(200);
        a8.move();
        a8.slowDown(50);

    }
}
