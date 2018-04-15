package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208b", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2450, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        // challenge solution
        Door theDoor = new Door();
        Window theWindow = new Window();
        Room theRoom = new Room(theDoor, theWindow);
        System.out.println(theRoom.getDoor().getMaterial());
        theRoom.getWindow().open();
        theRoom.openDoor();
    }
}
