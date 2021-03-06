package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addtion1Name;
    private double addition1Price;
    private String addtion2Name;
    private double addition2Price;
    private String addtion3Name;
    private double addition3Price;
    private String addtion4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddtion1(String name, double price) {
        this.addtion1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddtion2(String name, double price) {
        this.addtion1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddtion3(String name, double price) {
        this.addtion1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddtion4(String name, double price) {
        this.addtion1Name = name;
        this.addition1Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " +  this.breadRollType + " roll with " +
        this.meat + ", price is " + this.price);
        if (this.addtion1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addtion1Name + " for an extra " + this.addition1Price);
        }
        if (this.addtion2Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addtion1Name + " for an extra " + this.addition2Price);
        }
        if (this.addtion3Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addtion1Name + " for an extra " + this.addition3Price);
        }
        if (this.addtion4Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addtion1Name + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice;
    }
}
