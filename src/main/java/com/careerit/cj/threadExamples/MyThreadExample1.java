package com.careerit.cj.threadExamples;

public class MyThreadExample1 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        MyThreadExample1 t1 = new MyThreadExample1();
        MyThreadExample1 t2 = new MyThreadExample1();
        t1.start();
        t2.start();
    }
}
