package com.careerit.cj.day6;

import java.util.Scanner;

public class AssignmentOperatorClass {
    int x;
    public void addequal(int x){
        x += 10;
        System.out.println("The sum of "+ x + " and 10 is " + x);
    }
    public void subequal(int x){
        x -= 10;
        System.out.println("The diff of "+ x + " and 10 is " + x);
    }
    public void mulequal(int x){
        x *= 10;
        System.out.println("The product of "+ x + " and 10 is " + x);
    }
    public void divequal(int x){
        x /= 10;
        System.out.println("The division of "+ x + " and 10 is " + x);
    }
    public void modequal(int x){
        x %= 10;
        System.out.println("The mod of "+ x + " and 10 is " + x);
    }
    public void amperequal(int x){
        x &= 10;
        System.out.println("The and of "+ x + " and 10 is " + x);
    }
    public void orequale(int x){
        x |= 10;
        System.out.println("The or of "+ x + " and 10 is " + x);
    }
    public void xorequal(int x){
        x ^= 10;
        System.out.println("The xor of "+ x + " and 10 is " + x);
    }
    public void rightshift(int x){
        x >>= 10;
        System.out.println("The right shift of "+ x + " and 10 is " + x);
    }
    public void leftshift(int x){
        x <<= 10;
        System.out.println("The left shift of "+ x + " and 10 is " + x);
    }
    public static void main(String[] args){
        AssignmentOperatorClass obj = new AssignmentOperatorClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        obj.addequal(x);
        obj.subequal(x);
        obj.mulequal(x);
        obj.divequal(x);
        obj.modequal(x);
        obj.amperequal(x);
        obj.orequale(x);
        obj.xorequal(x);
        obj.rightshift(x);
        obj.leftshift(x);
    }
}
