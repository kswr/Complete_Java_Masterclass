package com.kswr.series;

import java.util.Scanner;

public class Series {
    public static int nSum(int integer) {
        int temp = 0;
        for (int i = 0; i <= integer; i++) {
            temp += i;
        }
        return temp;
    }
    public static int factorial(int integer) {
        if (integer < 1) {
            System.out.println("Incorrect value");
            return -1;
        }
        int temp = 1;
        for (int i = 1; i <= integer; i++) {
            temp *= i;
        }
        return temp;
    }

    public static int fibonacci(int num) {
        if (num < 2) {
            System.out.println("Value to small");
            return -1;
        }
        int[] fib = new int[num];
        fib[0] = 0;
        fib[1] = 1;
        int result = 0;
        for (int i = 2; i<num; i++) {
            fib[i] = fib[i-1]+fib[i-2];
        }
        for (int i: fib) {
            result += i;
        }
        return result;
    }

}
