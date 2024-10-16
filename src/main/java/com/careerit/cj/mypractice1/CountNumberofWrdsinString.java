package com.careerit.cj.mypractice1;

public class CountNumberofWrdsinString {

        public static void main(String[] args) {
            String str1 = "Hello, How are you? I am fine";
            int count = countWords(str1);
            System.out.println("The number of words in the string is :" + count);
        }

        private static int countWords(String str) {
            String[] arr = str.split(" ");
            return arr.length;
        }
}
