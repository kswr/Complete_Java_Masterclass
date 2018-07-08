import java.util.Scanner;

public class ScopeChallenge {
    private static Scanner scanner = new Scanner(System.in);
    private static int x;
    public static void main(String[] args) {
        x = scanner.nextInt();
        scanner.nextLine();
        for (int x = 0; x < 12; x++) {
            System.out.println(x + " " + ScopeChallenge.x);
        }
    }
}
