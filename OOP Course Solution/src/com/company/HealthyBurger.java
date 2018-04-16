package com.company;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1name;
    private double healthyExtra1price;
    private String healthyExtra2name;
    private double healthyExtra2price;

    public HealthyBurger(String meat, double price){
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthAddtition1(String name, double price) {
        this.healthyExtra1name = name;
        this.healthyExtra1price = price;
    }

    public void addHealthAddtition2(String name, double price) {
        this.healthyExtra1name = name;
        this.healthyExtra1price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1name != null) {
            hamburgerPrice += this.healthyExtra1price;
            System.out.println("Added " + this.healthyExtra1name + " for an extra " + this.healthyExtra1price);

        }
        if(this.healthyExtra2name != null) {
            hamburgerPrice += this.healthyExtra1price;
            System.out.println("Added " + this.healthyExtra2name + " for an extra " + this.healthyExtra2price);

        }
        return hamburgerPrice;
    }
}
