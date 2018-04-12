package com.company;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args){

        BankAccount emptyBankAccount = new BankAccount();
        BankAccount newBankAccount = new BankAccount("12_1234_1234_1234_1234", 100d, "John Johnson", "john.johnson@gmail.com", 504002345);
        newBankAccount.deposit(100);
        newBankAccount.withdrawal(100);
        newBankAccount.withdrawal(150);
        // prints default 0.0 value of double
        System.out.println(emptyBankAccount.getBalance());
        space();
        // prints devault null value of object of class String
        System.out.format(emptyBankAccount.getCustomerName() + "%n%n");
        BankAccount timsAccount = new BankAccount("John Lennon", "john.lennon@gmail.com", 504001518);
        System.out.println(timsAccount.getCustomerName());
        System.out.println(timsAccount.getEmail());
        System.out.println(timsAccount.getPhoneNumber());

        VipCustomer vip1 = new VipCustomer();
        VipCustomer vip2 = new VipCustomer("Bob", 10000d);
        VipCustomer vip3 = new VipCustomer("Ted", 10000d, "ted@gmail.com");

        System.out.println(vip1.getName());
        System.out.println(vip1.getEmailAddress());
        System.out.println(vip1.getCreditLimit());
        System.out.println(vip2.getName());
        System.out.println(vip2.getEmailAddress());
        System.out.println(vip2.getCreditLimit());
        System.out.println(vip3.getName());
        System.out.println(vip3.getEmailAddress());
        System.out.println(vip3.getCreditLimit());
    }

    // this class prints space between lines
    private static PrintStream space(){
        return(System.out.printf("%n"));
    }
}
