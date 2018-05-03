package com.company;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();
    public void walk(){
        System.out.println(getName() + " is walking");
    }

    public String getName() {
        return name;
    }
}
