package com.careerit.cj.day4;

public class TypeCasting {
    public static void main(String[] args){
        int a = 10;
        int b = 4;
        float c = a/b;
        int narrowcasting = (int)c;
        double widecasting = c;
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percantage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);

        System.out.println("The division of " + a + " and " + b + " is " + c);
        System.out.println("The narrow casting of " + c + " is " + narrowcasting);
        System.out.println("The wide casting of " + c + " is " + widecasting);

    }
}
