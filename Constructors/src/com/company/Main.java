package com.company;

public class Main {

    public static void main(String[] args) {
        //Challenge
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        Account account = new Account();
        Account account1 = new Account("Krzysztof Klicki", "krzysztof.klicki@gmail.com", 678134534);

//        Account account = new Account("25_5134_1351_1351_2345_1455_1545", 10_000_000L, "Krzysztof Kowalski", "krzysztof.kowalski@gmail.com", 507007578);
//        account.setAccountNumber("25_5134_1351_1351_2345_1455_1545");
//        account.setBalance(10_000_000L);
//        account.setCustomerName("Krzysztof Kowalski");
//        account.setEmail("krzysztof.kowalski@gmail.com");
//        account.setPhoneNumber(50700876);
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Current balance: " + account.getBalance());
        System.out.println("Customer: " + account.getCustomerName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone number: " + account.getPhoneNumber());
        account.addFunds(10_000L);
        account.withdrawFunds(50_000L);
        account.withdrawFunds(11_000_000L);
        account1.addFunds(30_000L);

        System.out.println("\nChallenge output\n");

        VipCustomer vipCustomer = new VipCustomer();
        VipCustomer vipCustomer1 = new VipCustomer("Krzysztof", "Ogromny limit");
        VipCustomer vipCustomer2 = new VipCustomer("Przemysław","Jeszcze większy limit", "Jakiś email");

        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer1.getEmail());
        System.out.println(vipCustomer2.getName());
    }
}
