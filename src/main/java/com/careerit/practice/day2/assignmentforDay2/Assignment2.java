package com.careerit.practice.day2.assignmentforDay2;
import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of Person 1 :");
        double weight1 = sc.nextDouble();
        System.out.println("Enter the height of Person 2 :");
        double weight2 = sc.nextDouble();
        System.out.println("Enter the weight of Person 3 :");
        double weight3 = sc.nextDouble();
        double totalweight = weight1 + weight2 + weight3;
        double avgweight = totalweight / 3;
        System.out.println("The total weight of 3 persons is " + totalweight);
        System.out.println("The average weight of 3 persons is " + avgweight);
    }
}
