package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void addContact(String name, int phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
        System.out.println("New contact added; name: " + name + " number: " + phoneNumber);
    }

    public void printContacts() {
        System.out.println("You have " + contacts.size() + " contacts in your phone book");
        for(int i = 0; i < contacts.size(); i++) {
            System.out.println("Contact " + (i+1) + ": " + contacts.get(i).getName() + ", phone number: " + contacts.get(i).getPhoneNumber());
        }
    }

    public void removeContact(int index) {
        contacts.remove(index);
    }

    public void removeContact(String name) {
        int index = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if (name.equals(contacts.get(i).getName())) {
               index = i;
            }
        }
        if (index >= 0) {
            removeContact(index);
            System.out.println("Contact " + name + " removed");
        } else {
            System.out.println("Contact not found");
        }
    }

    public void updateContact(int index, String newName, int newNumber) {
       contacts.set(index, new Contact(newName, newNumber));
    }

    public void updateContact(String oldName, String newName, int newNumber) {
        int index = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if (oldName.equals(contacts.get(i).getName())) {
                index = i;
            }
        }
        if (index >= 0) {
            updateContact(index, newName, newNumber);
            System.out.println("Contact " + oldName + " updated, new name: " + newName + " new phone: " + newNumber);
        } else {
            System.out.println("Contact " + oldName + " not found");
        }
    }
}
