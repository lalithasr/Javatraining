package com.careerit.cj.mypractice1;

public class EnumthroughLoop {

        public static void main(String[] args) {
            Level[] levels = Level.values();
            for (Level level : levels) {
                System.out.println(level);
            }
        }
}
