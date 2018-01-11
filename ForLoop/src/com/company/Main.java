package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10.000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        // I don't write the dumb part of code for printing out above string with various values, instead I will use loop

        // example loop

        for (int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        // CHALLENGE
        // using for loop calculate investment interest for 10,000 dollars with interest rates from ranges 2-8

        for (double i = 2; i < 9; i++) {
            System.out.println(calculateInterest(10000.0, i));
        }
    }

    // method for printing fictional coefficient of investment interest

    public static double calculateInterest(double amount, double interestRate) {
         return(amount * (interestRate/100));
    }
}
