package com.company;

import static java.lang.Thread.currentThread;

public class Main {

    public static void main(String[] args) {

        // main thread from main method
        System.out.println("Hello from the main method (main thread)");

        // new thread by instatiating class extending Thread class
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("Another Thread");
        anotherThread.start();
//        anotherThread.interrupt();

        // fun with main method
        System.out.println("Default name of maing thread is: " + currentThread().getName());
        currentThread().setName("main thread");
        System.out.println("But I changed it to: " + currentThread().getName());

        // new thread by instatiating anonymous class extending Thread class
        new Thread() {
            @Override
            public void run() {
                System.out.println("Hello from the anonymous class extending Thread class");
            }
        }.start();

        // new thread by instatiating class implementing Runnable interface
        Thread myRunnableThread1 = new Thread(new MyRunnable());
        myRunnableThread1.start();

        // new thread by overriding run() method from class implementing runnable interface
        Thread myRunnableThread2 = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println("Hello from method overriding run() method from class implementing runnable interface");
                try {
                    // current thread will be joined to anotherThread
//                    anotherThread.join(2000);
                    anotherThread.join();
                    System.out.println("Another thread terminated or timedout, so I'm running");
                } catch (InterruptedException e) {
                    System.out.println("I couldn't wait after all, I was interrupted");
                }
            }
        });

        myRunnableThread2.start();

    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from class implementing runnable interface");
    }
}

class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println("Hello from class extending Thread class, named: " +  currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Another thread woke " + currentThread().getName() + " up");
            return;
            // return to stop after interruption
        }

        System.out.println("Three seconds have passed and I'm awake");
    }
}