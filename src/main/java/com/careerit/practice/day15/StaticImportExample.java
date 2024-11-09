package com.careerit.practice.day15;
import static java.lang.System.out;

public class StaticImportExample {

        public static void main(String[] args) {
            out.println("Hello".concat(" World"));
            out.println(max(10,20));
            out.println(min(10,20));
            out.println(Math.sqrt(25));
        }
        public static int max(int a,int b){
            return a > b ? a : b;
        }
        public static int min(int a,int b){
            return a < b ? a : b;
        }
}
