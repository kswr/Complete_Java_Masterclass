package com.company;

public class DeluxeBurger extends Burger{
    private int soda = 1;
    private int chips = 1;

    public DeluxeBurger(String rollType, String meatType) {
        super("Deluxe Burger", rollType, meatType);
        setPrice(10);
    }

    @Override
    public void addLettuce(int amount) {
        System.out.println("Can't add anything to Deluxe Burger");
    }

    @Override
    public void addTomato(int amount) {
        System.out.println("Can't add anything to Deluxe Burger");
    }

    @Override
    public void addCarrot(int amount) {
        System.out.println("Can't add anything to Deluxe Burger");
    }

    @Override
    public void addBacon(int amount) {
        System.out.println("Can't add anything to Deluxe Burger");
    }

    @Override
    public void printBill() {
        System.out.println("Base burger price: $7");
        System.out.println("Price of soda and chips: $3");
        System.out.println("Total price of the burger " + getName() + " is: $" + getPrice());
    }
}
