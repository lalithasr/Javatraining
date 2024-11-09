package com.careerit.practice.day2;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to choose between 1 to 6:");
        int guessedNum = sc.nextInt();

        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Dice value : " + dice);
        if(guessedNum == dice){
            System.out.println("You won the game");
        } else {
        System.out.println("You lost the game");
        }
    }
}
