package com.company;

import static com.company.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_BLACK + "Hello from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("=== Another Thread ===");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous class thread");
            }
        }.start();

//        Thread myRunnableThread = new Thread(new myRunnable());

        Thread myRunnableThread = new Thread(new myRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from anonymous class implementation of run()");
                try {
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "Another thread terminated or timed out, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I coldn't wait after all. I was interrupted");
                }
            }
        });
        myRunnableThread.start();
        anotherThread.interrupt();
//        myRunnableThread.interrupt();

        System.out.println(ANSI_BLACK + "Hello again from the main thread");
    }
}
