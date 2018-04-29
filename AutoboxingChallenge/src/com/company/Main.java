package com.company;

public class Main {

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank1 = new Bank("Bank of India");
        bank1.addNewBranch("Warsaw 1");
        Branch berlin1 = new Branch("Berlin 1");
        bank1.addNewBranch(berlin1);
        bank1.addNewCustomer("Warsaw 1", "Stefan Kowalski", 200d);
//        bank1.getBranches().get(0).listCustomers();
        bank1.listCustomersOfBranch("Warsaw 1", true);
        System.out.println(" --- List branches no args ---");
        bank1.listBranches();
        System.out.println(" --- List branches 1 arg ---");
        bank1.listBranches(true);
        System.out.println(" --- List branches 2 args ---");
        bank1.listBranches(true, true);
    }
}
