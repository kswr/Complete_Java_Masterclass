package com.kswr;

public class Main {

    public static void main(String[] args) {
        int higscore = calculateScore(true, 800, 5, 10);
        System.out.println("Your final score was " + higscore);

        int highscore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highscore);

        int position = calculateHighscorePosition(900);
        System.out.println("His position was " + position);

        displayHighscorePosition("Joe", 1500);
        displayHighscorePosition("Ben", 900);
        displayHighscorePosition("Hoe", 400);
        displayHighscorePosition("John", 50);
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

    public static void displayHighscorePosition(String name, int points) {
        System.out.println(name + " managed to get into position " + calculateHighscorePosition(points));

    }

    public static int calculateHighscorePosition(int points) {
        if(points > 1000) {
            return 1;
        } else if ((points <= 1000) && (points > 500)) {
            return 2;
        } else if ((points <= 500) && (points > 100)) {
            return 3;
        }
        return 4;
    }
}
