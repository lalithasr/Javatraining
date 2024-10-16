package com.careerit.cj.lambdaexpressins;

public class LambdaExample1 {

        public static void main(String[] args) {

            Runnable r1 = () -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
            };
            Runnable r2 = () -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
            };

            Thread t1 = new Thread(r1);
            Thread t2 = new Thread(r2);

            t1.start();
            t2.start();
        }
}
