package com.kswr;

public class Main {

    public static void main(String[] args) {
        // System.out.println("ipsum");
        boolean game0ver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score==5000) {
            System.out.println("Your score was 5000");
            System.out.println("This was executed");
        }

        if(score < 5000) {
            System.out.println("Your score was less than 5000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        if(game0ver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // CHALLENGE

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(game0ver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
