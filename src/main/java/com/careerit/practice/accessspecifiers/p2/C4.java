package com.careerit.practice.accessspecifiers.p2;

import com.careerit.practice.accessspecifiers.p1.C1;

public class C4 extends C1 {

    public void show(){
        //System.out.println("Private : "+pri); Private member of C1 is not accessible in C2 class
        System.out.println("Public : "+pub);
        System.out.println("Protected : "+pro);
        //System.out.println("Default : "+def);
    }

    public static void main(String[] args) {
        C4 obj = new C4();
        obj.show();
    }
}
