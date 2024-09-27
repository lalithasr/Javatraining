package com.careerit.cj.day8;

public class MathFunctionDemo {
    public static void main(String args[]){
        double num = -16.5;
        double num1 = 16.5;
        System.out.println("Absolute value of "+num+" is "+Math.abs(num));
        System.out.println("Absolute value of "+num1+" is "+Math.abs(num1));
        double a = 5.3;
        double b = 5.8;
        System.out.println("Max of "+a+" and "+b+" is "+Math.max(a,b));
        System.out.println("Min of "+a+" and "+b+" is "+Math.min(a,b));
        //power and square root
        double base =2.0;
        double exp = 3.0;
        System.out.println("Power of "+base+" raised to "+exp+" is "+Math.pow(base,exp));
        System.out.println("Square root of "+base+" is "+Math.sqrt(base));
        System.out.println("Cube root of "+base+" is "+Math.cbrt(base));
        // Exponenetial and logarithm functions
        double value = 2.0;
        System.out.println("Exponential of "+value+" is : "+Math.exp(value));
        System.out.println("Logarithm of (log base e) "+value+" is "+Math.log(value));
        System.out.println("Logarithm of (log base 10) "+value+" is "+Math.log10(value));
        System.out.println("Logarithm of (log base 2) "+value+" is "+Math.log(value)/Math.log(2));
        System.out.println("Logarithm of (1 + " + value + ") is: " + Math.log1p(value));
        // Trigonometric functions
        double angle = 45.0;
        double radian = Math.toRadians(angle);
        System.out.println("Sin of "+angle+" is "+Math.sin(radian));
        System.out.println("Cos of "+angle+" is "+Math.cos(radian));
        System.out.println("Tan of "+angle+" is "+Math.tan(radian));
        // Hyperbolic functions
        System.out.println("Sinh of "+angle+" is "+Math.sinh(radian));
        System.out.println("Cosh of "+angle+" is "+Math.cosh(radian));
        System.out.println("Tanh of "+angle+" is "+Math.tanh(radian));
        //Inverse trigonometric functions
        double sinValue = 0.707;
        System.out.println("Arc sin of "+sinValue+" is "+Math.asin(sinValue));
        System.out.println("Arc cos of "+sinValue+" is "+Math.acos(sinValue));
        System.out.println("Arc tan of "+sinValue+" is "+Math.atan(sinValue));
        // Rounding functions
        double value1 = 5.5;
        double value2 = 5.4;
        System.out.println("Ceil of "+value1+" is "+Math.ceil(value1));
        System.out.println("Ceil of "+value2+" is "+Math.ceil(value2));
        System.out.println("Floor of "+value1+" is "+Math.floor(value1));
        System.out.println("Floor of "+value2+" is "+Math.floor(value2));
        System.out.println("Round of "+value1+" is "+Math.round(value1));
        System.out.println("Round of "+value2+" is "+Math.round(value2));
        // Random functions
        System.out.println("Random number between 0 and 1 is "+Math.random());
        System.out.println("Random number between 0 and 100 is "+Math.random()*100);
        // Truncate function
        double value3 = 5.6;
        double value4 = 5.4;
        System.out.println("Truncate of "+value3+" is "+Math.floor(value3));
        System.out.println("Truncate of "+value4+" is "+Math.floor(value4));
        //Hypot function
        double side1 = 3.0;
        double side2 = 4.0;
        System.out.println("Hypotenuse of right angled triangle with sides "+side1+" and "+side2+" is "+Math.hypot(side1,side2));
        //Signum function
        int value5 = 50;
        double value6 = -5.0;
        System.out.println("Signum of "+value5+" is "+Math.signum(value5));
        System.out.println("Signum of "+value6+" is "+Math.signum(value6));
        //Conversion between degrees and radians
        double angle1 = 45.0;
        double radian1 = Math.toRadians(angle1);
        System.out.println("Radian value of "+angle1+" is "+radian1);
        System.out.println("Degree value of "+radian1+" is "+Math.toDegrees(radian1));
    }
}
