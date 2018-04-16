package com.company;

public class Main {

    public static void main(String[] args) {
        Burger burger1 = new Burger("Bobby's Burger","Honey", "Chicken");
        burger1.addLettuce(2);
        burger1.addLettuce(2);
        burger1.addBacon(2);
        burger1.addCarrot(1);
        burger1.addTomato(1);
        burger1.printBill();

        HealthyBurger burger2 = new HealthyBurger("Beef");
        burger2.addLettuce(3);
        burger2.addOlives(3);
        burger2.addEgg(2);
        burger2.printBill();


        DeluxeBurger burger3 = new DeluxeBurger("White", "Pork");
        burger3.addBacon(1);
        burger3.printBill();
    }
}
