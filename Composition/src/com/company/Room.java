package com.company;

public class Room {
    private Door door;
    private Window window;

    public Room(Door door, Window window) {
        this.door = door;
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }

    public void openDoor() {
        System.out.println("Opening the door");
        this.door.open();
    }
}
