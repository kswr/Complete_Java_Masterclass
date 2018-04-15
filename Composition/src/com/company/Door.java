package com.company;

public class Door {
    private int height;
    private int width;
    private String material;
    private boolean isOpen;

    public Door() {
        this(2,1);
    }

    public Door(int height, int width) {
        this(height, width, "metal", false);
    }

    public Door(int height, int width, String material, boolean isOpen) {
        this.height = height;
        this.width = width;
        this.material = material;
        this.isOpen = isOpen;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open() {
        this.isOpen = true;
        System.out.println("Door is now open");
    }
}
