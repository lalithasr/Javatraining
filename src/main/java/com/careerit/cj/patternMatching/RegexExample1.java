package com.careerit.cj.patternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
    public static void main(String[] args){
        String text = "Hello, How are you? I am fine";
        String pattern = ".*fine.*";

        //compile the regular expressions
        Pattern compiledPattern = Pattern.compile(pattern);
        //Create a matcher for the input text
        Matcher matcher = compiledPattern.matcher(text);
        //check if the pattern matches the text
        if(matcher.matches()){
            System.out.println("Pattern matched " + matcher);
        } else {
            System.out.println("Pattern not matched");
        }
    }
}
