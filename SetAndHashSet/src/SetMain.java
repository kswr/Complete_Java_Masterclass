import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> cubes = new HashSet<>();
        Set<Integer> squares = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("Ther are " + squares.size() + " squares and " + cubes.size() + " cubes");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("union contains " + union.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements");
        for (int i : intersection) {
            System.out.println(i + " is the square of " +  Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>(Arrays.asList("all nature is but art unknown to thee".split(" ")));
        Set<String> divine = new HashSet<>(Arrays.asList("to err is human to forgive divine".split(" ")));

        Set<String> intersection00 = new HashSet<>(nature);
        intersection00.retainAll(divine);

        Set<String> symetricDifference = new HashSet<>(nature);
        symetricDifference.addAll(divine);
        symetricDifference.removeAll(intersection00);


    }
}
