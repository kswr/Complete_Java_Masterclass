package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Ipsum");

        //Integer
        // has a width of 32
        int myValue = 1000;
        int myMin = -2_147_483_648;
        System.out.println(myValue);
        System.out.println(myMin);
        System.out.println(myMin-1); // it begins to go back from the top of the range
        int myMax = 2_147_483_647;
        System.out.println(myMax);
        System.out.println(myMax+1); // begins from the bottom of the range
        // max 2^32-1, min -2^32
        int myTotal = (myMin/2);
        System.out.println("myTotal = " + myTotal);

        //Byte
        // has a width of 8
        byte myByte = 10;
        // range -128 to 127
        // max 2^8-1, min -2^8
        byte myNewByte = (byte) (myByte/2);
        System.out.println("myNewByte = " + myNewByte);

        //Short
        // has a width of 16
        short myShort = 30000;
        // range -32_768 to 32_767
        // max 2^32-1, min -2^63
        short myNewShortValue = (short) (myShort/2);

        //Long
        // has a width of 64
        long myLongValue = 100L;
        // max 2^63-1, min -2^63

        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid in number.
        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int

        byte newByte = 11;
        short newShort = 12;
        int newInt = 13;
        long newLong = 50000 + 10 * (newByte + newShort + newInt); // no need to casting due to fact that long variable will accept integer values
        System.out.println("newLong = " + newLong);
        
    }
}
