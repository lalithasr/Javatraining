package com.careerit.cj.day20.abstractionexamples.PaymentgatewayIntegration;

public class CreditPayment implements Payment {

    @Override
    public void doPayment(double amount) {
        System.out.println("Payment of amount : " + amount + " is done using credit card");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of amount : " + amount + " is done using credit card");
    }

    @Override
    public void showBalance(double balance) {
        System.out.println("Credit card balance is :" + balance);
    }
}
