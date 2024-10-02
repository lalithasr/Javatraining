package com.careerit.cj.day20.abstractionexamples.PaymentgatewayIntegration;

public interface Payment {

    public void doPayment(double amount);
    public void refund(double amount);
    public void showBalance(double balance);
}
