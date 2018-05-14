package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(digitSum(1111));
        System.out.println(digitSum(1));
        System.out.println(digitSum(10));
        System.out.println(digitSum(44));
//        String ipsum = "1010";
//        System.out.println(ipsum.charAt(0));
//        System.out.println(ipsum.charAt(1));
//        int ipsum2 = 10101;
//        String strIpsum2 = String.valueOf(ipsum2);
//        System.out.println(strIpsum2);
//        int value = 0;
//        for(int i = 0; i< strIpsum2.length(); i++) {
//            System.out.println(strIpsum2.charAt(i));
//            value = value + Character.getNumericValue(strIpsum2.charAt(i));
//            System.out.println(value);
//        }
    }
    public static int digitSum(int number) {
        String numbers = String.valueOf(number);
        int value = 0;
        if (number > 9){
            for (int i = 0; i < numbers.length(); i++){
                value += Character.getNumericValue(numbers.charAt(i));
            }
        } else {
            value = -1;
        }
        return value;
    }
}
