package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();


    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        mobilePhone.getContacts();

        mobilePhone.printContacts();

        mobilePhone.addContact("Jan Kowalski", 555666777);

        mobilePhone.printContacts();

        mobilePhone.removeContact("Roman Pawlak");

        mobilePhone.printContacts();

        mobilePhone.removeContact("Jan Kowalski");

        mobilePhone.printContacts();

        mobilePhone.addContact("Stefan Roman", 1435134515);
        mobilePhone.addContact("Przemysław Pawlak", 134134123);

        mobilePhone.printContacts();

        mobilePhone.updateContact("Przemysław Pawlak", "Tomasz Terlikowski", 504111876);

        mobilePhone.printContacts();

        boolean quit = false;
        int choice = 0;
        while (!quit) {
            options();
            System.out.println("Enter you choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    options();
                    break;
                case 1:
                    quit = true;
                    break;
                case 2:
                    printContacts();
                    break;
                case 3:
                    addContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    removeContact();
                    break;

            }
        }

    }
    public static void options() {
        System.out.println("\nPress: ");
        System.out.println("\t1 - Quit");
        System.out.println("\t2 - Print list of contacts");
        System.out.println("\t3 - Add new contact");
        System.out.println("\t4 - Update existing contact");
        System.out.println("\t5 - Remove contact");
    }

    public static void removeContact() {
        System.out.println("Type name of contact you want to delete ");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }

    public static void updateContact(){
        System.out.println("Type name of contact you want to update");
        String oldName = scanner.nextLine();
        System.out.println("Type new name: ");
        String newName = scanner.nextLine();
        System.out.println("Type new phone number");
        int newNumber = scanner.nextInt();
        scanner.nextLine();
        mobilePhone.updateContact(oldName, newName, newNumber);
    }

    public static void printContacts() {
        mobilePhone.printContacts();
    }

    public static void addContact() {
        System.out.println("Type new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Type new contact number: ");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();
        mobilePhone.addContact(name, phoneNumber);
    }
}
