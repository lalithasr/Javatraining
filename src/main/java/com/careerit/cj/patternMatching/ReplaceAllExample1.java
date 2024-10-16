package com.careerit.cj.patternMatching;

public class ReplaceAllExample1 {
    public static void main(String[] args){
        String text = "abc123def456ghi789";
        String pattern = "\\d+";
        //replace all digits with "#"
        String replacedText = text.replaceAll(pattern, "#");
        System.out.println("Replaced text: " + replacedText);
    }
}
