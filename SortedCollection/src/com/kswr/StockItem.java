package com.kswr;

import java.util.Objects;

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStock;


    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public StockItem(String name, double price) {
        this(name, price, 0);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public boolean setPrice(double price) {
        if (price > 0) {
            this.price = price;
            return true;
        } else return false;
    }

    public void adjustQuantity(int quantity) {
        int newQuantity = quantityStock + quantity;
        if (newQuantity >= 0) {
            quantityStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Entering StockItem.equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockItem stockItem = (StockItem) o;
        return Objects.equals(name, stockItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");
        if (this == o) {
            return 0;
        }
        if (o != null) {
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return name + ", price: " + price;
    }
}