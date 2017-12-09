package com.kswr;

public class Main {

    public static void main(String[] args) {
        // we covered following primitive datatypes (width in bytes)
        // byte (1)
        // short (2)
        // int (4)
        // long (8)
        // float (4)
        // double (8)
        // char (2)
        // boolean (machine dependent)

        // String is not a primitive data type, it's a class

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + " \u00A9 2015";
        System.out.println(myString);

        String numberString = "40.55";
        String secondNumberString = "90.55";
        String concatenateNumberStrings = numberString + secondNumberString;
        // this will concatenate strings
        System.out.println("Concatenation produces " + concatenateNumberStrings);

        int myInt = 10;
        String lastString = numberString + myInt;
        // this will cast myInt to string and concatenate it to numberString
        System.out.println("Integer concatenated with double is " + lastString);
        double myDouble = 20.20d;
        lastString = numberString + myDouble;
        System.out.println("String concatenated with double is " + lastString);
    }
}
