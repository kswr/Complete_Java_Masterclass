package com.company;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
//        Create a for statement using a range of numbers from 1 to 1000 inclusive.
//
//        Sum all the numbers that can be divided with both 3 and also with 5.
//
//        For those numbers that met the above conditions, print out the number.
//
//        break out of the loop once you find 5 numbers that met the above conditions.
//
//        After breaking out of the loop print the sum of the numbers that met the above conditions.
//
//       Note: Type all code in main method


        int[] thousand = IntStream.rangeClosed(1,1000).toArray();

        int tempInt = 0;
        int counter = 0;
        for(int element : thousand) {
            if (element % 3 == 0 && element % 5 == 0) {
                tempInt += element;
                System.out.println(element);
                counter++;
                if (counter == 5) {
                    break;
                }
            }
        }
        System.out.println(tempInt);

    }
}
