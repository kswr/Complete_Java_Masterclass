package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default.email@gmail.com");
    }

    VipCustomer() {
        this("Default Name", 100d, "default.email@gmail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
