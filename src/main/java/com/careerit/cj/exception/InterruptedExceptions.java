package com.careerit.cj.exception;

public class InterruptedExceptions {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                System.out.println("Thread is going to sleep");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted : " + e.getMessage());
            }
        });
        t.start();
        t.interrupt();
    }
}
