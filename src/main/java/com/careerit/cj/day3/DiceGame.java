package com.careerit.cj.day3;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args){
        Random random = new Random();
        int randonNum = random.nextInt(6) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1 to 6");
        int guessednumber = sc.nextInt();
        if(guessednumber == randonNum) {
        System.out.println("YOU WON");
        } else {
            System.out.println("You Lost ");
            System.out.println("Number needed to win is " +randonNum);
        }

    }
}
