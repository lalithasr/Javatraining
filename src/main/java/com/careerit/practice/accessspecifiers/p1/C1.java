package com.careerit.practice.accessspecifiers.p1;

public class C1 {
    private  int pri = 10;
    public  int pub = 20;
    protected int pro = 30;
    int def = 40;

    public void show(){
        System.out.println("Private : "+pri);
        System.out.println("Public : "+pub);
        System.out.println("Protected : "+pro);
        System.out.println("Default : "+def);
    }

    public static void main(String[] args) {
        C1 obj = new C1();
        obj.show();
    }
}
