package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(getDigitCount(-100));
//        System.out.println(getDigitCount(100));
//        System.out.println(reverse(122));
//        System.out.println(reverse(-122));
//        System.out.println(reverse(1));
//        System.out.println(reverse(100));
        numberToWords(1234);
        numberToWords(-1234);
        numberToWords(100);
    }
    public static int getDigitCount(int number) {
        int length = -1;
        if (number >= 0) {
            length = Integer.toString(number).length();
        }
        return length;
    }

    public static int reverse(int number) {
        int revNumber = 0;
        while (number != 0) {
            revNumber *= 10;
            revNumber += number % 10;
            number /= 10;
        }
        return revNumber;
    }

    public static void numberToWords(int number) {
        if (number > 0) {
            int length = getDigitCount(number);
            int wordCount = 0;
            int revNumber = reverse(number);
            while (revNumber != 0) {
                switch (revNumber % 10) {
                    case 1:
                        System.out.println("One");
                        wordCount++;
                        break;
                    case 2:
                        System.out.println("Two");
                        wordCount++;
                        break;
                    case 3:
                        System.out.println("Three");
                        wordCount++;
                        break;
                    case 4:
                        System.out.println("Four");
                        wordCount++;
                        break;
                    case 5:
                        System.out.println("Five");
                        wordCount++;
                        break;
                    case 6:
                        System.out.println("Six");
                        wordCount++;
                        break;
                    case 7:
                        System.out.println("Seven");
                        wordCount++;
                        break;
                    case 8:
                        System.out.println("Eight");
                        wordCount++;
                        break;
                    case 9:
                        System.out.println("Nine");
                        wordCount++;
                        break;
                    case 0:
                        System.out.println("Zero");
                        wordCount++;
                        break;
                    default:
                        break;
                }
                revNumber /= 10;
            }
            while (wordCount < length) {
                System.out.println("Zero");
                wordCount++;
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
