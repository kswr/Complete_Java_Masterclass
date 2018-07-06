import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinMaxInputChall {
    public static void main(String[] args) {
        printMaxAndMin();
    }
    public static void printMaxAndMin() {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number:");
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Max " + Collections.max(integers));
                System.out.println("Min " +Collections.min(integers));
            } else {
                System.out.println("Invalid input");
                scanner.nextLine();
                try {
                    System.out.println("Max " +Collections.max(integers));
                    System.out.println("Min " +Collections.min(integers));
                } catch (Exception e) {
                    System.out.println("Array is empty");
                }
            }
        }
    }
}
