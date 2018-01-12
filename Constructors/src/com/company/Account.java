package com.company;

public class Account {
    private String accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // constructor

    public Account() {
        this("25_5134_1351_1351_2345_1455_1545", 10_000_000L, "Krzysztof Kowalski", "krzysztof.kowalski@gmail.com", 507007578);
        System.out.println("Empty constructor called");
    }

    public Account(String customerName, String email, int phoneNumber) {
        this("25_5134_1351_1351_2345_1455_1545", 10_000_000L, customerName, email, phoneNumber);
    }

    public Account(String accountNumber, long balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Account constructor with parameters called");
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void addFunds(long deposit) {
        this.balance += deposit;
        System.out.println("Current balance = " + this.balance);
    }

    public void withdrawFunds(long withdraw) {
        if (withdraw <= this.balance) {
            this.balance -= withdraw;
        } else {
            System.out.println("Funds insufficient");
        }
        System.out.println("Current balance = " + this.balance);
    }
}
