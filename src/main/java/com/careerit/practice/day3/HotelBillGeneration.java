package com.careerit.practice.day3;

import java.util.Scanner;

public class HotelBillGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount :");
        float billamount = sc.nextFloat();
        float discount = 0;
        if(billamount >= 1000 && billamount < 2000) {
            discount = billamount * 10/100;
        }else if(billamount >= 2000 && billamount < 5000) {
            discount = billamount * 20/100;
        } else if(billamount >= 5000 ) {
            discount = billamount * 30/100;
        } else {
            discount = billamount * 5/100;
        }
        float netAmount = billamount - discount;
        System.out.println("The bill amount is : "+billamount);
        System.out.println("The discount is : "+discount);
        System.out.println("The net amount is : "+netAmount);

    }
}
