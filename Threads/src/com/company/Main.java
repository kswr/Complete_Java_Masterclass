package com.company;

import static com.company.ThreadColor.ANSI_BLACK;
import static com.company.ThreadColor.ANSI_CYAN;
import static com.company.ThreadColor.ANSI_GREEN;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_BLACK + "Hello from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_BLACK + "Hello again from the main thread");
    }
}
