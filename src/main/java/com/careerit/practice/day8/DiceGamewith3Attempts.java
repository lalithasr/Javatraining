package com.careerit.practice.day8;

import java.util.Scanner;

public class DiceGamewith3Attempts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of attempts :");
        int attempts = sc.nextInt();
        System.out.println("Enter the target number :");
        int target = sc.nextInt();
        int num = (int) (Math.random() * 6) + 1;

        for (int i = 1; i <= attempts; i++) {
            System.out.println("Attempt : " + i + " Number to win is : " + num);
            if (num == target) {
                System.out.println("You won the game  : " + target);
                break;
            } else {
                System.out.println(" This is " + i + " attempt you have selected the number : " + target);
            }
        }
        if(num != target){
            System.out.println("You lost the game, the number is : "+num);
        } else {
            System.out.println("You won the game as the target matches the number : " + target);
        }
    }
}
