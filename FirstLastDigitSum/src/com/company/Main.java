package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(50005));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(1000));
        System.out.println(sumFirstAndLastDigit(-5005));

    }
    public static int sumFirstAndLastDigit(int number) {
        int ret = -1;
        if (number >= 0) {
            int tempNumber = number;
            while (tempNumber > 9) {
                tempNumber /= 10;
            }
            ret = tempNumber + number % 10;
        }
        return ret;
    }
}
