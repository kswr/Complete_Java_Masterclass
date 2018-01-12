package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nWhile loop example\n");

        int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("\n2nd approach to the same while loop\n");

        count = 0;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("\nDo while loop example\n");

        count = 0;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);

        System.out.println("\nAnother approach to breaking out of do-while loop\n");

        count = 0;
        do {
            System.out.println("Count value is " + count);
            count++;
            if (count > 10) {
                break;
            }
        } while (count != 0);

        System.out.println("\nFor loop example\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("For value is " + i);
        }

        System.out.println("\nChallenge 1. output\n");

        System.out.println(isEvenNumber(6));

        System.out.println("\nChallenge 2. output\n");

        int startNumber = 5;
        int endNumber = 20;

        // this will print only even numbers between 5 and 20

        int evenNumbers = 0;
        while (startNumber <= endNumber) {
            if (!isEvenNumber(startNumber)) {
               startNumber++;
               continue; // comes back to start of the loop
            }
            System.out.println("Even number: " + startNumber);
            startNumber++;
            evenNumbers++;
            if (evenNumbers == 5) {
                break;
            }
        }
        System.out.println("Total number of even numbers found: " + evenNumbers);

    }
    // Challenge
    // Create method that determines if passed argument is even or not

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
