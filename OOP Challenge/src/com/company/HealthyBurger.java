package com.company;

public class HealthyBurger extends Burger {
    private int additionalEgg = 0;
    private int additionalOlives = 0;

    public HealthyBurger(String meatType) {
        super("Healthy Burger", "Brown rye", meatType);
    }

    public int getAdditionalEgg() {
        return additionalEgg;
    }

    public int getAdditionalOlives() {
        return additionalOlives;
    }

    public void addEgg (int amount) {
        this.additionalEgg += amount;
        int detailPrice = 2;
        int totalPrice = detailPrice*amount;
        System.out.println("Amount of egg added: " + amount);
        System.out.println("Total amount of egg in burger: " + this.additionalEgg);
        System.out.println("Price of egg added: $" + totalPrice);
        setPrice(getPrice()+totalPrice);
        System.out.println("Total price of burger $" + getPrice());
    }

    public void addOlives (int amount) {
        this.additionalOlives += amount;
        int detailPrice = 3;
        int totalPrice = detailPrice*amount;
        System.out.println("Amount of olives added: " + amount);
        System.out.println("Total amount of olives in burger: " + this.additionalOlives);
        System.out.println("Price of olives added: $" + totalPrice);
        setPrice(getPrice()+totalPrice);
        System.out.println("Total price of burger $" + getPrice());
    }

    @Override
    public void printBill() {
        System.out.println("Type of meat: " + getMeatType());
        System.out.println("Type of bun: " + getRollType());
        System.out.println("Amount of lettuce: " + getAdditionalLettuce());
        System.out.println("Additional lettuce price: $" + getAdditionalLettuce());
        System.out.println("Amount of tomato: " + getAdditionalTomato());
        System.out.println("Additional lettuce price: $" + getAdditionalTomato());
        System.out.println("Amount of carrot: " + getAdditionalCarrot());
        System.out.println("Additional lettuce price: $" + getAdditionalCarrot());
        System.out.println("Amount of bacon: " + getAdditionalBacon() * 2);
        System.out.println("Additional lettuce price: $" + getAdditionalBacon() * 2);
        System.out.println("Amount of eggs: " + getAdditionalEgg());
        System.out.println("Additional eggs price: $" + getAdditionalEgg() * 2);
        System.out.println("Amount of olives: " + getAdditionalOlives());
        System.out.println("Additional olives price: $" + getAdditionalOlives() * 3);
        System.out.println("Total price of the burger " + getName() + " is: $" + getPrice());
    }
}
