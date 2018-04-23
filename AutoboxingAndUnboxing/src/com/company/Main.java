package com.company;

import java.util.ArrayList;

class IntClass{
    private int myInteger;

    public IntClass(int myInteger) {
        this.myInteger = myInteger;
    }

    public int getMyInteger() {
        return myInteger;
    }

    public void setMyInteger(int myInteger) {
        this.myInteger = myInteger;
    }
}

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[10];
        String[] strArray = new String[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
//        ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));

        // valid solution - autoboxing + unboxing (long way)

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            integerArrayList.add(Integer.valueOf(i));
        }


        for(int i = 0; i < integerArrayList.size(); i++ ) {
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // Integer.valueOf(56); - this is what happens at compile time
        int myInt = myIntValue; // myIntValue.intValue(); - this is what happens at compile time

//       integerArrayList.add(5); - this line is also being modified at compile time

    }
}
