import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about java");
            System.out.println("Java added succesfully");
        }

        languages.put("Java", "compiled, high level, oo, platform-independent programmming language");
        languages.put("Python", "interpreted, oo, high-level, dynamic");
        System.out.println(languages.put("Algol", "algorythmic language"));
        languages.put("Lisp", "therein lies madness");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about java");
            System.out.println("Java added succesfully");
        }

        System.out.println(languages.get("Java"));
        System.out.println(languages.put("Java", "this course is about java"));

        System.out.println(languages.get("Java"));

//        languages.remove("Lisp");
        if (languages.remove("Algol", "a family of algorithmic languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/val part not found");
        }

        if(languages.replace("Lisp", "a functional programming (...)","This will not work")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        languages.replace("Scala", "this will not be added");

        System.out.println("========================");
        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
