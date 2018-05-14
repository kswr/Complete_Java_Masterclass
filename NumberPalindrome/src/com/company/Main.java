package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(1122));

    }

//    public static int revNumber(int number) {
//        int reversedNumber = 0;
//        while (number != 0) {
//            reversedNumber *= 10;
//            reversedNumber += number % 10;
//            number /= 10;
//        }
//        return reversedNumber;
//    }
//
//    public static boolean isPalindrome(int number) {
//        boolean palind = false;
//        int reversedNumber = revNumber(number);
//        if (reversedNumber == number) {
//            palind = true;
//        }
//        return palind;
//    }

    public static boolean isPalindrome(int number) {
        boolean palind = false;
        int reversedNumber = 0;
        int tempNum = number;
        while(tempNum!=0) {
            reversedNumber *=10;
            reversedNumber += tempNum % 10;
            tempNum /= 10;
        }
        if (reversedNumber == number) {
            palind = true;
        }
        return palind;
    }
}
