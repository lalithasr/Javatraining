package com.careerit.cj.stringBuffervsStringBuilder;

public class Example4 {
        public static void main(String[] args) {
            // Creating a StringBuffer
            StringBuffer sb = new StringBuffer("Hello");

            // Append
            sb.append(" World");
            System.out.println("After append: " + sb); // Output: "Hello World"

            // Insert
            sb.insert(5, ",");
            System.out.println("After insert: " + sb); // Output: "Hello, World"

            // Replace
            sb.replace(0, 5, "Hi");
            System.out.println("After replace: " + sb); // Output: "Hi, World"

            // Delete
            sb.delete(2, 3);
            System.out.println("After delete: " + sb); // Output: "Hi World"

            // Reverse
            sb.reverse();
            System.out.println("After reverse: " + sb); // Output: "dlroW iH"

            // Length and Capacity
            System.out.println("Length: " + sb.length());    // Length of the sequence
            System.out.println("Capacity: " + sb.capacity()); // Initial capacity is 16 + length of "Hello"
        }
    }


