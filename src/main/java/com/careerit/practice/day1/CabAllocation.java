package com.careerit.practice.day1;

import java.util.Scanner;

public class CabAllocation {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the available people :");
            int availablePeople = sc.nextInt();
            System.out.println("Enter the cab capacity :");
            int cabCapacity = sc.nextInt();
            int totalCabs = availablePeople / cabCapacity;
            System.out.println("Total cabs before the loop: " + totalCabs);
            if(availablePeople % cabCapacity != 0){
                totalCabs += 1;
            }
            System.out.println("Total cabs required: " + totalCabs);
            System.out.println("Remaining people : " + (availablePeople % cabCapacity));

        }
}
