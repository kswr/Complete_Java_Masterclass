package com.kswr;

public class Main {

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 10);
        calculateScore(true, 10000, 8, 200);
    }

    public static int calculateScore(boolean game0ver, int score, int levelCompleted, int bonus) {
        if(game0ver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }
}
