package com.careerit.cj.stringBuffervsStringBuilder;

public class Example2 {
    public static void main(String[] args) {
        // Using StringBuilder for fast string concatenation
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append("Hello ");
        }
        System.out.println("StringBuilder Result: " + builder.toString());

        // Using StringBuffer in a multi-threaded scenario (for demonstration)
        StringBuffer buffer = new StringBuffer();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                buffer.append("Thread1 ");
            }

        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                buffer.append("Thread2 ");
            }
            System.out.println("Thread2 finished : " + buffer.toString());

        });

        thread1.start();
        thread2.start();

        // Wait for threads to finish


        System.out.println("StringBuffer Result: " + buffer.toString());
    }

}
