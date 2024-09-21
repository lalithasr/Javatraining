package com.careerit.cj.day2;

import java.util.Scanner;

public class DifferentOperations {
    int num1;
    int num2;
    public DifferentOperations(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void sum(){
        int sum = num1+num2;
        System.out.println(sum);
    }
    public void diff(){
        int diff = num1 - num2;
        System.out.println(diff);
    }
    public void mul(){
        int mul = num1 * num2;
        System.out.println(mul);
    }
    public void mod(){
        int mod = num1%num2;
        System.out.println(mod);
    }
    public void div(){
        int div = num1/num2;
        System.out.println(div);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        DifferentOperations obj = new DifferentOperations(num1, num2);
        obj.sum();
        obj.diff();
        obj.mod();
        obj.mul();
        obj.div();

    }
}
