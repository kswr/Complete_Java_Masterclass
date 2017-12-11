package com.kswr;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Not 1 or 2");
//        }

        int switchValue = 4;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Not 1 or 2");
                break;
        }

        char charSwitchValue = 'e';

        switch (charSwitchValue) {
            case 'a':
                System.out.println("Value was 'a'");
                break;
            case 'b':
                System.out.println("Values was 'b'");
                break;
            case 'c':
                System.out.println("Value was 'c'");
                break;
            case 'd':
                System.out.println("Value was 'd'");
                break;
            case 'e':
                System.out.println("Value was 'e'");
                break;
            default:
                System.out.println("Value not found");
                break;
        }

        switch (charSwitchValue) {
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println("Value was " + charSwitchValue);
                break;
            default:
                System.out.println("Value was not found");
                break;
        }

        // use .toLowerCase() when working with strings

        String month = "June";

        switch (month.toLowerCase()) {
            case "june":
                System.out.println("Jun");
                break;
            case "january":
                System.out.println("Jan");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
