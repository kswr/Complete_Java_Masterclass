package com.company;

public class Burger {
    private int price;
    private String name;
    private String rollType;
    private String meatType;
    private int additionalLettuce = 0;
    private int additionalTomato = 0;
    private int additionalCarrot = 0;
    private int additionalBacon = 0;

    public Burger(String name, String rollType, String meatType) {
        this.name = name;
        this.price = 5;
        if (rollType == "White" || rollType == "Honey" || rollType == "Full Grain") {
            this.rollType = rollType;
        } else {
            this.rollType = "Burger Bun";
        }
        if (meatType == "Pork" || meatType == "Chicken" || meatType == "Lamb") {
            this.meatType = meatType;
        } else {
            this.meatType = "Beef";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public int getAdditionalLettuce() {
        return additionalLettuce;
    }

    public int getAdditionalTomato() {
        return additionalTomato;
    }

    public int getAdditionalCarrot() {
        return additionalCarrot;
    }

    public int getAdditionalBacon() {
        return additionalBacon;
    }

    public void addLettuce(int amount) {
        this.additionalLettuce += amount;
        int detailPrice = 1;
        int totalPrice = detailPrice*amount;
        System.out.println("Amount of lettuce added: " + amount);
        System.out.println("Total amount of lettuce in burger: " + this.additionalLettuce);
        System.out.println("Price of lettuce added: $" + totalPrice);
        this.price += totalPrice;
        System.out.println("Total price of burger $" + this.price);
    }

    public void addTomato(int amount) {
        this.additionalTomato += amount;
        int detailPrice = 1;
        int totalPrice = detailPrice*amount;
        System.out.println("Amount of tomato added: " + amount);
        System.out.println("Total amount of tomato in burger: " + this.additionalTomato);
        System.out.println("Price of tomato added: $" + totalPrice);
        this.price += totalPrice;
        System.out.println("Total price of burger $" + this.price);
    }

    public void addCarrot(int amount) {
        this.additionalCarrot += amount;
        int detailPrice = 1;
        int totalPrice = detailPrice*amount;
        System.out.println("Amount of carrot added: " + amount);
        System.out.println("Total amount of carrot in burger: " + this.additionalCarrot);
        System.out.println("Price of carrot added: $" + totalPrice);
        this.price += totalPrice;
        System.out.println("Total price of burger $" + this.price);
    }

    public void addBacon(int amount) {
        this.additionalBacon += amount;
        int detailPrice = 2;
        int totalPrice = detailPrice*amount;
        System.out.println("Amount of bacon added: " + amount);
        System.out.println("Total amount of bacon in burger: " + this.additionalBacon);
        System.out.println("Price of bacon added: $" + totalPrice);
        this.price += totalPrice;
        System.out.println("Total price of burger $" + this.price);
    }

    public void printBill() {
        System.out.println("Type of meat: " + this.meatType);
        System.out.println("Type of bun: " + this.rollType);
        System.out.println("Amount of lettuce: " + this.additionalLettuce);
        System.out.println("Additional lettuce price: $" + this.additionalLettuce);
        System.out.println("Amount of tomato: " + this.additionalTomato);
        System.out.println("Additional lettuce price: $" + this.additionalTomato);
        System.out.println("Amount of carrot: " + this.additionalCarrot);
        System.out.println("Additional lettuce price: $" + this.additionalCarrot);
        System.out.println("Amount of bacon: " + this.additionalBacon);
        System.out.println("Additional lettuce price: $" + this.additionalBacon);
        System.out.println("Total price of the burger " + this.name + " is: $" + this.price);
    }

}
