package com.kswr;

public class Main {

    public static void main(String[] args) {
        // decimal points variables
        // there are 2 types - float and double

        // Integer width = 32 (4 bytes)
        int myIntValue = 5 / 2;
        // Float width = 32 (4 bytes)
        float myFloatValue = 5f / 2f; // they work also when dividing by integers
        // Double width = 64 (8 bytes)
        double myDoubleValue = 5.0 / 2.0;
        double mySecondDouble = 5d / 2d;
        float mySecondFloat = (float) 5.0;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("mySecondFloat = " + mySecondFloat);
        System.out.println("myDoubleValue = " +  myDoubleValue);
        System.out.println("mySecondDouble = " + mySecondDouble);

        // CHALLENGE

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        double kilograms = 20d;
        double pounds;
        pounds = kilograms / 0.45359237d;
        System.out.println(kilograms + " kilograms is " + pounds + " pounds.");

        double pi = 3.141_592_7d;
        System.out.println(pi);
    }
}
