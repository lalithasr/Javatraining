package com.careerit.cj.patternMatching;

import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String args[]){
        String text = "abc123";
        String pattern = "\\w+\\d+";
        boolean matches = Pattern.matches(pattern, text);
        System.out.println("Pattern matches: " + matches);
    }
}
