package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(4, 1, "metal", 250);
        vehicle1.speedUp(50);
        vehicle1.turn(30);
        Convertible convertible1 = new Convertible(4,1,340,2,8,"gas", "blue", 4, 5, true);
        convertible1.fold();
        System.out.println(convertible1.isFolded());
        convertible1.unfold();
        System.out.println(convertible1.isFolded());
    }
}
