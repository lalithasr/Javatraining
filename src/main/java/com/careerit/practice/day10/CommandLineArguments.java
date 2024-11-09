package com.careerit.practice.day10;

public class CommandLineArguments {

        public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("Please pass the arguments");
            } else {
                System.out.println("The arguments passed are : ");
                for (String arg : args) {
                    System.out.println(arg);
                }
            }
        }
}
