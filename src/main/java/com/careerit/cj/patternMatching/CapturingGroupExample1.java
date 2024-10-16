package com.careerit.cj.patternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapturingGroupExample1 {
    public static void main(String[] args){
        String text = "John Doe, Age: 25";
        String pattern = "(\\w+) (\\w+), Age: (\\d+)";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(text);

        if(matcher.find()){
            System.out.println("Name: " + matcher.group(1));
            System.out.println("Last Name: " + matcher.group(2));
            System.out.println("Age: " + matcher.group(3));
        }
    }
}
