import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TestDrive01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string01;
        while (true) {
            string01 = scanner.nextLine();
            String[] strings = string01.split(" ");
            if (Arrays.asList(strings).contains("exit")) {
                break;
            } else {
                for (String str : strings) {
                    System.out.println(str);
                }
            }
        }
    }
}
