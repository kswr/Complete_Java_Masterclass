package com.company;

import java.util.ArrayList;

public class Branch {
    String name;
    ArrayList<Customer> customers;

    public Branch(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public Branch(String name) {
        this(name, new ArrayList<>());
        System.out.println("Branch " + name + " created");
    }

    public String getName() {
        return name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer " + customer.getName() + " added to branch " + this.name);
    }

    public void addNewCustomer(String name, double initialTransaction) {
        Customer customer = new Customer(name);
        customer.addTransaction(initialTransaction);
        customers.add(customer);
        System.out.println("Customer " + name + " with initial transaction of "
        + initialTransaction + " added to branch " + this.name);
    }

    public void addTransaction(int customerId, double amount) {
        customers.get(customerId).addTransaction(amount);
        System.out.println("Added transaction for " + amount + ", customer: " + customers.get(customerId).getName());
    }

    public void addTransaction(String name, double amount) {
        int customerId = getCustomerId(name);
        if (customerId >= 0) {
            addTransaction(customerId, amount);
        } else {
            System.out.println("Customer not found, can't add transaction");
        }
    }

    public int getCustomerId(String name) {
        int customerId = -1;
        for (int i = 0; i < customers.size(); i++){
            if(name == customers.get(i).getName()) {
                customerId = i;
                System.out.println("Found customer");
            } else {
                System.out.println("Customer not found");
            }
        }
        return customerId;
    }

    public void listCustomers() {
        listCustomers(false);
    }

    public void listCustomers(boolean listTransactions) {
        if (customers.size() == 0) {
            System.out.println("There are no customers on this branch");
        } else {
            for (int i = 0; i < customers.size(); i++) {
                System.out.println("Customer " + (i+1) + " --> " + customers.get(i));
                if (listTransactions) {
                    customers.get(i).listTransactions();
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Branch " + this.getName();
    }
}
