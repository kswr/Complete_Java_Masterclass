package com.company;

public class Main {

    public static void main(String[] args) {
        checkNumber(1);
        checkNumber(0);
        checkNumber(-1);
    }

    public static void checkNumber(int number) {

        if (number == 0) {
            System.out.println("Number " + number + " is equal to 0");
        } else if (number > 0) {
            System.out.println("Number " + number + " is greater than 0");
        } else {
            System.out.println("Number " + number + " is lesser than 0");
        }
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        System.out.println();
    }
}
