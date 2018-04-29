package com.company;

import java.util.ArrayList;

public class Bank {
    String name;
    private ArrayList<Branch> branches;

    public Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = branches;
        System.out.println("Created bank " + name);
    }

    public Bank(String name) {
        this(name, new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addNewBranch(Branch branch) {
        branches.add(branch);
        System.out.println("Added branch " + branch.getName() + " to bank " + this.name);
    }

    public void addNewBranch(String name) {
        branches.add(new Branch(name));
        System.out.println("Added branch " + name + " to bank " + this.name);
    }

    public void addNewCustomer(Branch branch, String name, double initialTransaction) {
        int id = getBranchId(branch);
        branches.get(id).addNewCustomer(name, initialTransaction);
//        System.out.println("Added customer " + name + " with initial transaction of " +
//        initialTransaction + " to branch " + branch.getName() + " of bank " + this.name);
    }

    public void addNewCustomer(String branchName, String name, double initialTransaction) {
        int id = getBranchId(branchName);
        branches.get(id).addNewCustomer(name, initialTransaction);
    }

    private int getBranchId(Branch branch) {
        int branchId = -1;
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).equals(branch)){
                System.out.println("Branch was found, returning id");
                branchId = i;
            }
            // todo make into try/catch block
            if (branchId == -1){
                System.out.printf("Branch not found");
            }
        }
        return branchId;
    }

    private int getBranchId(String name) {
        int branchId = -1;
        for (int i = 0; i < branches.size(); i++) {
            if(branches.get(i).getName() == name) {
                System.out.println("Branch was found, returning id");
                branchId = i;
            }
        }
        // todo make into try/catch block
        if (branchId == -1) {
            System.out.println("Branch not found");
        }
        return branchId;
    }

    private Branch getBranch(String name) {
        int branchId = getBranchId(name);
        return this.branches.get(branchId);
    }

    public void listCustomersOfBranch(String branchName) {
        listCustomersOfBranch(branchName, false);
    }

    public void listCustomersOfBranch(String branchName, boolean listTransactions) {
        Branch branch = getBranch(branchName);
        System.out.println("Branch " + branchName);
        branch.listCustomers(listTransactions);
    }

    public void listBranches() {
        listBranches(false, false);
    }

    public void listBranches(boolean listCustomers) {
        listBranches(listCustomers, false);
    }

    public void listBranches(boolean listCustomers, boolean listTransactions) {
        if (branches.size() == 0) {
            System.out.println("This bank has no branches");
        } else {
            System.out.println("Branches of " + this.name);
            for (int i = 0; i < branches.size(); i++) {
//                System.out.print("\t");
                System.out.println("Branch " + (i+1) + " --> " + branches.get(i));
                if (listCustomers) {
                    branches.get(i).listCustomers(listTransactions);
                }
            }
        }
    }
}
