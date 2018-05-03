package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
        dog.walk();
        Parrot bird1 = new Parrot("Australian ringneck");
        bird1.breathe();
        bird1.eat();
        bird1.walk();
        bird1.fly();
        Penguin penguin1 = new Penguin("Emperor");
        penguin1.breathe();
        penguin1.eat();
        penguin1.walk();
        penguin1.fly();
    }
}
