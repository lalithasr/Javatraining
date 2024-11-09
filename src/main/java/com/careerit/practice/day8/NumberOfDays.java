package com.careerit.practice.day8;
import java.util.Scanner;
public class NumberOfDays {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the year: ");
                int year = sc.nextInt();
                System.out.println("Enter the month number (1-12) :");
                int month = sc.nextInt();
                if(month <= 0 || month > 12){
                        System.out.println("Invalid month number");
                }else {
                        int days = dayInMonth(month,year);
                        System.out.println("Month " + getMonthName(month) + " has " + days + " days.");
                }

        }

        public static String getMonthName(int month){
                String monthName = "";
                switch (month) {
                        case 1:
                                monthName = "January";
                                break;
                        case 2:
                                monthName = "February";
                                break;
                        case 3:
                                monthName = "March";
                                break;
                        case 4:
                                monthName = "April";
                                break;
                        case 5:
                                monthName = "May";
                                break;
                        case 6:
                                monthName = "June";
                                break;
                        case 7:
                                monthName = "July";
                                break;
                        case 8:
                                monthName = "August";
                                break;
                        case 9:
                                monthName = "September";
                                break;
                        case 10:
                                monthName = "October";
                                break;
                        case 11:
                                monthName = "November";
                                break;
                        case 12:
                                monthName = "December";
                                break;
                        default:
                                monthName = "Invalid month number";
                }
                return monthName;
        }

        public static int dayInMonth(int month,int year){
                int days;
                switch(month){
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12: days = 31;
                                break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                                days = 30;
                                break;
                        case 2:
                                // Logic
                        default: days = -1;
                }
                return days;
        }

        public static boolean isLeapYear(int year){
                return (year % 4 == 0 && year % 100 != 0) || year % 400==0;
        }


}