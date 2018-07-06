package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";
        System.out.println(challenge1.matches("I want a bike."));

        String regExp = "I want a b\\w+.";
        System.out.println(challenge1.matches(regExp));
        System.out.println(challenge2.matches(regExp));

        String regExp1 = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));

        String patternString = "I want a b\\w+.";
        Pattern pattern1 = Pattern.compile(patternString);

        Matcher matcher1 = pattern1.matcher(challenge1);
        boolean matches1 = matcher1.matches();

        Matcher matcher2 = pattern1.matcher(challenge2);
        boolean matches2 = matcher2.matches();

        System.out.println(matches1);
        System.out.println(matches2);

        String stringToReplace = "Replace all blanks with underscores";
        System.out.println(stringToReplace.replaceAll("\\s", "_"));

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge1.matches(".*"));
        System.out.println(challenge5.matches("[a-g]+"));

        System.out.println(challenge5.matches("^[a]{3}b[c]{8}[d]{3}e[f]{3}g$"));

        String challenge7 = "abcd.135";
        String shouldMatch = "kjisl.22";
        String shouldNotMatch = "f5.12a";

        String regEx2 = "^\\D+.\\d+";
        Pattern pattern2 = Pattern.compile(regEx2);

        Matcher matcher3 = pattern2.matcher(challenge7);
        Matcher matcher4 = pattern2.matcher(shouldMatch);
        Matcher matcher5 = pattern2.matcher(shouldNotMatch);

        System.out.println(matcher3.matches());
        System.out.println(matcher4.matches());
        System.out.println(matcher5.matches());
    }
}
