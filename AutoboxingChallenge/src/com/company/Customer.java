package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public Customer(String name) {
        this(name, new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }

    public void listTransactions() {
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println("Transaction " + (i+1) + " --> " + transactions.get(i));
        }
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
