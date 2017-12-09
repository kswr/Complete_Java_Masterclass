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

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + " \u00A9 2015";
        System.out.println(myString);
    }
}
