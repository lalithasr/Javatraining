package com.careerit.cj.day12;

public class CalenderGenerator {
    public static void main(String[] args){
        int daysInMonth = 31;
        int daysInWeek = 7;
        int currentDay = 1;
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int week = 0; week < 5; week++) { // 5 weeks
            for (int day = 0; day < daysInWeek; day++) {
                if (currentDay <= daysInMonth) {
                    System.out.printf("%3d ", currentDay); // Print the day of the month
                    currentDay++;
                } else {
                    System.out.print("    "); // Empty space for remaining days
                }
            }
            System.out.println();
        }
    }
}
