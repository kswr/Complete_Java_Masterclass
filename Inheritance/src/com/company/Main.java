package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Animal", 1,1,5,5);
        Dog dog1 = new Dog("Yorkie", 8,20,2,4,1,20, "long silky");
//        dog1.eat();
        dog1.walk();
        System.out.format("%n");
        dog1.run();
    }
}
