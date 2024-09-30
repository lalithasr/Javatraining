package com.careerit.cj.day13;

public class BreakContinueexample {

    public static void main(String[] args) {
        System.out.println("Example of continue");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(" "+ i);
        }
        System.out.println("\nExample of break");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(" "+ i);
        }
        System.out.println("\nDifference between break and continue is break will terminate the loop and continue will skip the current iteration");

    }
}
