package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("\ncalculateInterest method sample output:\n");
        System.out.println("10.000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        // I don't write the dumb part of code for printing out above string with various values, instead I will use loop

        // example loop

        System.out.println("\nSample loop:\n");

        for (int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        // CHALLENGE part 1
        // using for loop calculate investment interest for 10,000 dollars with interest rates from ranges 2-8

        System.out.println("\nChallange part 1. result:\n");

        for (double i = 2; i < 9; i++) {
//            System.out.println(calculateInterest(10000.0, i));
            System.out.println("10.000 with " + i + " interest is " + String.format("%.2f", calculateInterest(10000.0,i)));
        }

        // Challenge part 2
        // modify above loop to go from 9 to 2

        System.out.println("\nChallange part 2. result:\n");

        for (double i = 9; i > 1; i--) {
            System.out.println("10.000 with " + i + " interest is " + String.format("%.2f", calculateInterest(10000.0,i)));
        }

        // Challenge part 3
        // count primes in given sequence of numbers, break if number hits 3

        System.out.println("\nChallenge part 3. result:\n");

        System.out.println("Found primes: " + countPrimes(4,10));

        System.out.println("\nChallenge part 3. second solution\n");

        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
            }
            if (count == 3) {
                break;
            }

        }
    }

    // method for printing fictional coefficient of investment interest

    public static double calculateInterest(double amount, double interestRate) {
         return(amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int countPrimes(int starting, int ending) {
        int count = 0;
        for (int i = starting; i <= ending; i++) {
           if (isPrime(i)) {
               count++;
           }
           if (count == 3) {
               break;
           }
        }
        return count;
    }

}
