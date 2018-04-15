package com.company;

import java.util.Arrays;

public class Toner {
    private String color;
    private int fill;

    public Toner(String color, int fill) {
        if(Arrays.asList("black","red","green","blue").contains(color.toLowerCase()))
            this.color = color;
        else {
            this.color = "black";
        }
        if (fill >= 10 && fill <= 100) {
           this.fill = fill;
        } else {
            this.fill = 100;
        }
    }

    public Toner() {
        this("black", 100);
    }

    public void refill() {
        System.out.println("Toner -> refilling");
        this.fill = 100;
        System.out.println("Toner is now refilled");
    }

    public void print(int pages) {
        // todo refill during printing (printing in a loop)
        if ((this.fill - pages) >= 0) {
            System.out.printf("%s toner is printing%n", this.color);
            this.fill =- pages;
        } else {
            System.out.printf("%s toner needs refilling%n", this.color);
            this.refill();
        }
    }

    public String getColor() {
        return color;
    }

    public int getFill() {
        return fill;
    }
}
