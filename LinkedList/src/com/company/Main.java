package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> toVisit = new LinkedList<>();
        toVisit.add("Warsaw");
        toVisit.add("Cracov");
        toVisit.add("Melbourne");
        toVisit.add("Berlin");
        toVisit.add("Paris");
        toVisit.add("Madrid");

//        printLinkedList(toVisit);

        LinkedList<String> newToVisit = new LinkedList<>();
        addInOrder(newToVisit, "Warsaw");
        printLinkedList(newToVisit);
        addInOrder(newToVisit, "Cracov");
        addInOrder(newToVisit, "Melbourne");
        addInOrder(newToVisit, "Berlin");
        printLinkedList(newToVisit);
        addInOrder(newToVisit, "Paris");
        addInOrder(newToVisit, "Madrid");
        printLinkedList(newToVisit);
        addInOrder(newToVisit, "Paris");
        printLinkedList(newToVisit);

        visit(newToVisit);
    }

    private static void printLinkedList(LinkedList linkedList) {
        // ListIterator had more functionalities than Iterator
        ListIterator<String> i = linkedList.listIterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already in the list");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                System.out.println("Added " + newCity + " to linkedlist");
                return true;
            } else if (comparison < 0) {
                // move to next city
            }
        }
        stringListIterator.add(newCity);
        System.out.println("Added " + newCity + " to linkedlist");
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("Cities list is empty");
            return;
        } else {
            System.out.println("Now visiting" + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("End of the vacation");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                            goingForward = true;
                        }
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("We reached end of the list");
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                            goingForward = false;
                        }
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the beginning of the list");
                    }
                    break;
                case 3:
                    printMenu();
            }
        }
    }
    public static void printMenu() {
        System.out.println("Select action\n" +
                "press\n" +
                "0 - Stop visiting\n" +
                "1 - Go to the next city\n" +
                "2 - Go to the previous city\n" +
                "3 - Print menu");
    }
}
