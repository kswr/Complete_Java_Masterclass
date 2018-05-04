package com.company;

public class AnotherThread extends Thread{

//    private String name;
//    public AnotherThread(String name) {
//        this.name = name;
//    }

//    @Override
//    public String getName() {
//        return name;
//    }

    @Override
    public void run() {
        System.out.println("Hello from another thread");
    }
}
