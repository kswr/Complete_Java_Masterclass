import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println(divideDangerous(1,0));
//        System.out.println(divideLBYL(1,0));
//        System.out.println(divideEAPF(1,0));
        int x = getIntEAFP();
        System.out.println(x);
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getIntLBYL() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = scanner.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        } else {
            return 0;
        }
    }

    private static int getIntEAFP() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    private static int divideLBYL(int x, int y) {
        if(y!=0) {
            return x/y;
        } else {
            return 0;
        }
    }

    private static int divideEAPF(int x, int y) {
        try {
            return x/y;
        } catch (Exception e) {
            return 0;
        }
    }

    private static int divideDangerous(int x, int y) {
        return x/y;
    }
}
