package com.kswr;

public class Main {

    public static void main(String[] args) {

        // char has width of 16 (2 bytes)
        char myCharValue = 'a'; // can't be more than one character
        char mySecondChar = '\u00A9';
        System.out.println("myCharValue = " + myCharValue);
        System.out.println("Unicode character is " + mySecondChar);

        // Boolean width is machie dependent
        boolean myBoolean = true;
        boolean mySecondBoolean = false;

        // CHALLENGE

        // display registered symbol

        char registered = '\u00AE';
        System.out.println("Registered symbol is " + registered);
    }
}
