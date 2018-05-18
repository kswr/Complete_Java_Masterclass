package com.company;


public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        // . is wildcard for replacing any character or integer in string
        String alphanumeric = "abcdeeeF12Ghiiiiabcdeeejkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));

        // ^someString replaces someString only if it occurs at the beggining of the string
        System.out.println(alphanumeric.replaceAll("^abcdeee", "YYY"));
        System.out.println(alphanumeric.replaceAll("abcdeee", "YYY"));

        // with matches method, whole string has to match regex
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcdeee"));
        System.out.println(alphanumeric.matches(".*"));

        // $ is end of string
        System.out.println(alphanumeric.replaceAll("jkl99z$", "THE END"));

        // letters in square brackets mean any of the letters from between them
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
    }
}
