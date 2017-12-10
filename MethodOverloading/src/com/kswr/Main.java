package com.kswr;

public class Main {

    // overloading is not overriding, do not confuse these terms

    // Overloading is using the same method name but with other number of arguments, which are "signature" of the method

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double diffInCm = calcFeetAndInchesToCetimeters(2,10);
        System.out.println("The difference between given feet and inches in centimeters is " + diffInCm);
        double feetInCm = calcFeetAndInchesToCetimeters(18);
        System.out.println("There is " + feetInCm + " feet in given number of inches");
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }


    // CHALLENGE

    public static double calcFeetAndInchesToCetimeters(double feet, double inches) {
        if ((feet >= 0) && ((inches >= 0) && (inches <= 12))) {
            double feetInCm = feet * 30.48;
            double inchesInCm = inches * 2.54;
            double diff = feetInCm - inchesInCm;
            return diff;
        }
        return 0;
    }

    public static double calcFeetAndInchesToCetimeters(double inches) {
        if (inches >= 0) {
            double feetInInches = inches/12;
            return feetInInches;
        }
        return -1;
    }
}
