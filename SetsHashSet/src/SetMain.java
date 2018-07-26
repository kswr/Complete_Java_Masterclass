import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes  = new HashSet<>();

        for(int i=1; i<=100; i++) {
            squares.add((int)Math.pow(i,2));
            cubes.add((int)Math.pow(i,3));
        }
        System.out.println("There are " + squares.size() + " squares");
        System.out.println("There are " + cubes.size() + " cubes");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements");
        for (int i: intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentance = "one day in the year fo the fox";
        String[] arrayWords = sentance.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s: words) {
            System.out.println(s);
        }


        Set<String> nature = new HashSet<>();
        String[] natureWords = "all nature is but art unknown to thee".split(" ");
        nature.addAll(Arrays.asList(natureWords));

        Set<String> divine = new HashSet<>();
        String[] divineWords = "to err is human to forgive divine".split(" ");
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> asymetricUnion = new HashSet<>(nature);
        asymetricUnion.addAll(divine);
        Set<String> common = new HashSet<>(nature);
        common.retainAll(divine);
        asymetricUnion.removeAll(common);
        System.out.println("Symmetric difference");
        printSet(asymetricUnion);


        if(nature.containsAll(divine)) {
            System.out.println("divine is a subset of nature");
        }

        if (nature.containsAll(common)) {
            System.out.println("Intersection is a subset of nature");
        }
        if (divine.containsAll(common)) {
            System.out.println("Intersection is a subset of divine");
        }
    }

    public static void printSet(Set<String> set){
        System.out.print("\t");
        for (String str: set) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
