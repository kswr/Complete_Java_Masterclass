package com.kswr;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2; // assignment operator
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        // mathematical operators

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result = result + 1;
        System.out.println("The result is now " + result);
        result++;
        System.out.println("The result is now " + result);
        result--;
        System.out.println("The result is now " + result);
        result += 2;
        System.out.println("The result is now " + result);
        result *= 10;
        System.out.println("The result is now " + result);
        result -= 10;
        System.out.println("The result is now " + result);
        result /= 10;
        System.out.println("The result is now " + result);

        // relational oparators

        boolean isAlien = false;
        if (isAlien == false) // equality operator
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore > 100)
            System.out.println("You got the high score");

        // equal
        // != not equal
        // <= less equal
        // >= greater equal
        // < less
        // > greater

        // boolean operators

        // && short circuit and operator

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)) // remember to put brackets around pairs of conditions to evade problems with operators precedence
            System.out.println("Greater than second top score and less than 100");

        // || or

        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar) // remember not to mistake assignment operator for equality operator and don't compare boolean value
            System.out.println("It's a car");

        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        // CHALLENGE

        double myDouble = 20;
        double mySecondDouble = 80;
        double equation = (myDouble + mySecondDouble) * 25;
        double total = equation % 40;
        System.out.println("Total is " + total);
        if (total <= 20)
            System.out.println("Total was over the limit");

    }
}
