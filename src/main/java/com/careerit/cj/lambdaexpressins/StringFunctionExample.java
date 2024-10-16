package com.careerit.cj.lambdaexpressins;

public class StringFunctionExample {

    public static void main(String[] args) {

        StringFunctions sf1 = (str) -> str.toUpperCase();
        StringFunctions sf2 = (str) -> str.toLowerCase();
        StringFunctions sf3 = (str) -> str.substring(0, 3);

        String str = "Core Java";
        System.out.println(sf1.run(str));
        System.out.println(sf2.run(str));
        System.out.println(sf3.run(str));

    }
}
