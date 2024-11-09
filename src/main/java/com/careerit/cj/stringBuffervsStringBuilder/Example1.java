package com.careerit.cj.stringBuffervsStringBuilder;

public class Example1 {

        public static void main(String[] args) {

            String name = "Core Java";
            String newName = name.concat(" Programming");
            System.out.println(name);
            System.out.println(newName);

            StringBuffer sb = new StringBuffer("Core Java");
            sb.append(" Programming");
            System.out.println(sb);

            StringBuilder builder = new StringBuilder("Core Java");
            builder.append(" Programming");
            System.out.println(builder);

        }
}
