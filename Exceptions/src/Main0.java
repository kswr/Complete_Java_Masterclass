import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        try {
            float result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }
    }

    private static float divide() throws ArithmeticException, NoSuchElementException{
        int y, x;
        try {
            x = getInt();
            y = getInt();
            System.out.printf("x is: %d, y is: %d%n",x, y);
            return x/y;
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("no suitable input");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("attempt to divide by zero");
        }
    }

//    private static int getInt() {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            int temp = scanner.nextInt();
//            return temp;
//        } catch (InputMismatchException e) {
//            e.printStackTrace();
//            return 0;
//        }
//    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Argument incorrect, type value again");
            }
        }
    }
}
