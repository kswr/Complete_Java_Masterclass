package com.company;

// import java.text.DecimalFormat;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
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

    public double getBalance() {
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

    public void deposit(double value) {
        System.out.println("---Deposit operation---");
        System.out.format("Current account balance: $%.2f%n", balance);
        System.out.format("Deposit amount: $%.2f%n", value);
        System.out.println("Processing deposit...");
        balance = balance + value;
        System.out.format("Account balance after deposit: $%.2f%n%n", balance);

    }

    public void withdrawal(double value) {
        System.out.println("---Withdrawal operation---");
        System.out.printf("Current account balance: $%.2f%n", balance);
        System.out.format("Expexted withdrawal amount: $%.2f%n", value);
        if ((balance - value) >= 0) {
            balance = balance - value;
            System.out.println("Processing withdrawal...");
            System.out.format("Account balance after withdrawal: $%.2f%n%n", balance);
        } else {
            System.out.format("Insufficient funds, withdrawal halted%n%n");
        }
    }

    // calls "full" constructor
    public BankAccount() {
        this("00_0000_0000_0000_0000",0d,"No name","No email", 000_000_000);
        System.out.println("---Account creation---");
        System.out.format("Empty constructor called%n%n");
    }

    // calls "full" constructor
    public BankAccount(String customerName, String email, int phoneNumber) {
        this("00_0000_0000_0000", 100d, customerName, email, phoneNumber);
        // this.customerName = customerName;
        // this.email = email;
        // this.phoneNumber = phoneNumber;
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("---Account creation---");
        System.out.format("Created a bank account for %s%nAccount number: %s%nInitial balance: %.2f%nCustomer email: %s%nCustomer phone number: %s%n%n", customerName, accountNumber, balance, email, phoneNumber);
    }
}
