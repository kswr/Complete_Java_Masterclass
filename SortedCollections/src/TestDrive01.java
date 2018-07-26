import java.util.HashSet;
import java.util.Set;

public class TestDrive01 {
    public static void main(String[] args) {
        Set<Integer> set01 = new HashSet<>();
        set01.add(1);
        for (int i : set01) {
            System.out.println(i);
        }
        Set<Animal> set02 = new HashSet<>();
        Dog dog1 = new Dog(13, 34, "REx", "Spaniel");

        set02.add(dog1);
        for (Animal animal : set02) {
            System.out.println(animal);
        }
    }
}
