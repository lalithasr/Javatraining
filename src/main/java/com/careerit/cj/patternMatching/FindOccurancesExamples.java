package com.careerit.cj.patternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOccurancesExamples {
    public static void main(String[] args){
        String text = "met my pets, cat, bat, rat";
        String pattern = "\\b\\w+et\\b";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(text);
        while (matcher.find()){
            System.out.println("Found: " + matcher.group());
        }
    }
}
