package com.careerit.cj.threadExamples;

public class SleepExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is going to sleep for 5 seconds");
                Thread.sleep(5000);
                System.out.println("Thread is woke up ");
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted");
            }
        });
        thread.start();
    }
}
