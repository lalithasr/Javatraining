package com.careerit.cj.day3;

import java.util.Scanner;

public class HotelBillGeneration {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount : ");
        float billamount = sc.nextFloat();
        float discount = 0;
        if(billamount > 2000){
            discount = billamount * 20/100;
        } else {
            discount = billamount * 5/100;
        }

        float netAmount = billamount - discount;
        System.out.println("Bill amount is : " + billamount);
        System.out.println("Discount is : "+ discount);
        System.out.println("Net amount is : "+ netAmount);
    }
}
