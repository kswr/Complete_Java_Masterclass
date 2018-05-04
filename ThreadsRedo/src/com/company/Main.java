package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the main class");

        // new thread by instatiating class extending Thread class
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        // new thread by instatiating anonymous class
    }


}
