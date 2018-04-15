package com.company;

public class Window {
    private int height;
    private int width;
    private int noOfSashes;
    private boolean isOpen;

    public Window () {
        this(1,2);
    }
    public Window (int height, int width) {
        this(height, width, 2, false);
    }

    public Window (int height, int width, int noOfSashes, boolean isOpen) {
        this.height = height;
        this.width = width;
        this.noOfSashes = noOfSashes;
        this.isOpen = isOpen;
    }

    public void open() {
        this.isOpen = true;
        System.out.println("Windows is now open");
    }

    public void close() {
        this.isOpen = false;
        System.out.println("Window is now closed");
    }
}
