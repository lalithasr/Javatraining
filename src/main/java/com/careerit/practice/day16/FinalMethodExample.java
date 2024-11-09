package com.careerit.practice.day16;

class Calc{
    public  int max(int... arr){
        int sum = 0;
        for(int ele:arr){
            sum += ele;
        }
        return sum;
    }
    public double emiCal(double p, double r, double t){
        r = r / 12 / 100;
        return p * r * Math.pow(1 + r, t) / (Math.pow(1 + r, t) - 1);
    }
}

class AdvCalc extends Calc{
   public double sign(double value){
       return Math.sin(value);
   }

   public int max(int a,int b){
       return a > b ? a : b;
   }
}
public class FinalMethodExample {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        obj.max(10,20);
        obj.sign(90);
        System.out.println(obj.max(10,20,30,40,50));
        System.out.println(obj.emiCal(100000, 10, 12));
        System.out.println(obj.sign(90));
    }

}
