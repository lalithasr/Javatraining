package com.careerit.cj.patternMatching;

public class SplitExample {
    public static void main(String[] args){
        String text = "Hello, How are you? I am fine";
        String pattern = ",";
        String[] words = text.split(pattern);
        for(String word: words){
            System.out.println(word);
        }
    }
}
