package com.company;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        // returns null
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("911");
        // returns Carrera
        System.out.println("Model is " + porsche.getModel());
    }
}
