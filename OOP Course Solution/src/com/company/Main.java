package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddtion1("Tomato", 0.27);
        hamburger.addHamburgerAddtion2("Lettuce", 0.75);
        hamburger.addHamburgerAddtion3("Cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger1 = new HealthyBurger("Bacon", 5.55);
        healthyBurger1.addHamburgerAddtion1("Egg", 5.46);
        healthyBurger1.addHealthAddtition1("Lentils", 3.33);
        System.out.println("Total Healthy Burger price is " + healthyBurger1.itemizeHamburger());
        healthyBurger1.addHealthAddtition2("Sauce", 1.0);
    }
}
