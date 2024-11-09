package com.careerit.practice.accessspecifiers.p2;
import com.careerit.practice.accessspecifiers.p1.C1;

public class C5 {

    public static void main(String[] args) {
        C1 obj = new C1();
        // System.out.println("Private : "+obj.pri); Private member of C1 is not accessible in C3 class
        System.out.println("Public : "+obj.pub);
        // System.out.println("Protected : "+obj.pro); Protected member of C1 is not accessible in C3 class
        //System.out.println("Default : "+obj.def);
    }
}
