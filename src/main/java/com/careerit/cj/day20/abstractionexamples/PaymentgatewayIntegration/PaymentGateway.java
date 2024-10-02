package com.careerit.cj.day20.abstractionexamples.PaymentgatewayIntegration;

import java.util.Scanner;

public class PaymentGateway {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount:");
        double amount = sc.nextDouble();
        System.out.println("Enter the balance in the account:");
        double balance = sc.nextDouble();
        Payment payment = new CreditPayment();
        payment.doPayment(amount);
        payment.refund(amount);
        payment.showBalance(balance);

    }
}
