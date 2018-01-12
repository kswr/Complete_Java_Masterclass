package com.company;

public class Main {

    public static void main(String[] args) {
        Car porshe = new Car(); // created object based on the template car
        Car holden = new Car();

        // before setting field value
        System.out.println("Model is " + porshe.getModel());
        porshe.setModel("Carrera");
        // after setting field value
        System.out.println("Model is " + porshe.getModel());
    }
}
