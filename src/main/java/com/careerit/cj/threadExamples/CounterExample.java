package com.careerit.cj.threadExamples;

public class CounterExample {
    private int count = 0;
    public synchronized void increment() {
        count++;
    }
    public  int getCount() {
        return count;
    }
    public static void main(String[] args) throws InterruptedException{
        CounterExample obj = new CounterExample();
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                obj.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                obj.increment();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count : "+obj.getCount());
    }
}
