import java.util.Scanner;

public class TestDrive02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth");
        boolean hasInt = scanner.hasNextInt();
        if (hasInt) {
            int yearOfB = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + ". You are " + (2018-yearOfB) + " years old");
        }
    }
}
