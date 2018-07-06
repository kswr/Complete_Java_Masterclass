package com.company;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        // . is wildcard for replacing any character or integer in string
        String alphanumeric = "abcdeeeF12Ghiiefi iabcdeeejkl99z";
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

        // only replace a or e or i that are followed by F or j (remember case sensitivity)
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        // this is example of capital or small letter
        System.out.println("Harry".replaceAll("[Hh]arry", "Harry"));

        // remove every letter except...
        // inside square brackets it indicates NOT, other than beginning of the string (outside the brackets)
        System.out.println(alphanumeric.replaceAll("[^ej]", "X"));

        // ranges of letters and numbers
        System.out.println(alphanumeric.replaceAll("[abcdef345678]", "X"));
        // same effect as
        System.out.println(alphanumeric.replaceAll("[a-f3-8]", "X"));
        // to deal with case sensitivity
        System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        // or use special construct
        // add u for uniocode string
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X"));

        // replace any digit
        System.out.println(alphanumeric.replaceAll("[0-9]", "X"));
        // or
        System.out.println(alphanumeric.replaceAll("\\d", "X"));
        // capital D for non-digits
        System.out.println(alphanumeric.replaceAll("\\D", "X"));

        String hasWhiteSpace = "I have blanks and\ta tab, and also a \nnewline";
        System.out.println(hasWhiteSpace);
        // replace all whitespace characters
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        // replace specific kind of whitespaces
        System.out.println(hasWhiteSpace.replaceAll("\\t", ""));
        System.out.println(hasWhiteSpace.replaceAll("\\n", ""));
        System.out.println(hasWhiteSpace.replaceAll("[\\n\\t]", ""));
        // replace all not-whitespaces
        System.out.println(hasWhiteSpace.replaceAll("\\S", "X"));

        // replace any word character
        System.out.println(alphanumeric.replaceAll("\\w", "X"));
        // replacy any non-word character
        System.out.println(alphanumeric.replaceAll("\\W", "X"));
        // replace any boundry character
        System.out.println(alphanumeric.replaceAll("\\b", "X"));

        // quantifier comes after the number it quantifies
        System.out.println(alphanumeric.replaceAll("^abcde{3}", "YYY"));
        // any number of "e"
        System.out.println(alphanumeric.replaceAll("^abcde+", "YYY"));
        // 0 or more "e"
        System.out.println(alphanumeric.replaceAll("^abcde*", "YYY"));
        // 2 to 5 "e"
        System.out.println(alphanumeric.replaceAll("^abcde{2,5}", "YYY"));
        // any numbers of "h" followed by 0 or more "i" followed by single j
        System.out.println(alphanumeric.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>Paragraph</p>");
        htmlText.append("<p>Another paragraph</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        // create regex string
        String h2Pattern = "<h2>";
        // compile pattern
        Pattern pattern = Pattern.compile(h2Pattern);
        // create matcher
        Matcher matcher = pattern.matcher(htmlText);
        // print out if matches or not
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        // greedy vs lazy quantifier
        // only remove or put back "?"
        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurence " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>(.+?)</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurence: " + h2TextMatcher.group(2));
        }

        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        String tvTest = "tstvtkt";
        String notVRegEx = "t[^v]";
        Pattern notVPattern = Pattern.compile(notVRegEx);
        Matcher notVMatcher = notVPattern.matcher(tvTest);

        count = 0;
        while (notVMatcher.find()) {
            count++;
            System.out.println("Occurence " + count + " : " + notVMatcher.start() + " to " + notVMatcher.end());

        }

    }
}
