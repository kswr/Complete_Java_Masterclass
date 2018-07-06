import java.util.ArrayList;
import java.util.Scanner;

public class ScannerChallenge {
    public static void main(String[] args) {
        ArrayList<Integer> integers = readNumbers(10);
        for (int i: integers) {
            System.out.println(i);
        }
    }
    public static ArrayList<Integer> readNumbers(int length) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int i = 1;
        while (integers.size()<10) {
            System.out.println("Insert number #" + i);
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
                i++;
            } else {
                System.out.println("Invalid input, try again");
            }
            scanner.nextLine();
        }
        return integers;
    }
}
