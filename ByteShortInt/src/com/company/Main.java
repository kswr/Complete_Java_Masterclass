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
        
        //Byte
        // has a width of 8
        byte myByte = 10;
        // range -128 to 127
        // max 2^8-1, min -2^8

        //Short
        // has a width of 16
        short myShort = 30000;
        // range -32_768 to 32_767
        // max 2^32-1, min -2^63

        //Long
        // has a width of 64
        long myLongValue = 100L;
        // max 2^63-1, min -2^63


    }
}
