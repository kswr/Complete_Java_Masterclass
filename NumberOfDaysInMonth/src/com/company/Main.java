package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(2004)); // true
        System.out.println(isLeapYear(1996)); // true
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(1901)); // false
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

    }
    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (year > 0 && year < 10000) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                isLeap = true;
            }
        }
        return isLeap;
    }

    public static int getDaysInMonth(int month, int year) {
        int days = -1;
        if(month > 0 && month < 13 && year > 0 && year < 10000) {
            switch (month) {
                case 1:
                    days = 31;
                    break;
                case 2:
                    if (isLeapYear(year)){
                       days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6:
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                    break;
                default:
                    break;
            }
        }
        return days;
    }
}
