package com.company;

public class Main {

    public static void main(String[] args) {

//        System.out.println(sumOdd(1,100));
//        System.out.println(sumOdd(-1,100));
//        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(1,11));

    }
    public static boolean isOdd(int number) {
        boolean tempRet = false;
        if (number > 0 && number % 2 == 0) {
            tempRet = true;
        }
        return tempRet;
    }

    public static int sumOdd(int start, int end) {
        int tempRet = -1;
        if (start > 0 && end > 0 && end >= start) {
            tempRet = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    tempRet += i;
                    System.out.println(i);
                }
            }
        }
        return tempRet;
    }
}
