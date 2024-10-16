package com.careerit.cj.threadExamples;

public class DeadLockExample {
    public synchronized void m1(DeadLockExample obj) {
        System.out.println("Thread1 starts execution of m1 method");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread1 waiting for lock on obj2");
        }
        System.out.println("Thread1 trying to call m2 method");
        obj.m2(this);
    }
    public synchronized void m2(DeadLockExample obj) {
        System.out.println("Thread2 starts execution of m2 method");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread2 waiting for lock on obj1");
        }
        System.out.println("Thread2 trying to call m1 method");
        obj.m1(this);
    }
    public static void main(String[] args) {
        DeadLockExample obj1 = new DeadLockExample();
        DeadLockExample obj2 = new DeadLockExample();
        Thread t1 = new Thread(() -> {
            obj1.m1(obj2);
        });
        Thread t2 = new Thread(() -> {
            obj2.m2(obj1);
        });
        t1.start();
        t2.start();
    }
}
