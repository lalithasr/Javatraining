package com.careerit.cj.wrapperClassExamples;

public class WrapperClassExample1 {

        public static void main(String[] args) {

            int num =10;
            System.out.println(num);
            Integer wrapperNum = Integer.valueOf(num);
            System.out.println(wrapperNum);
            int unboxedNum = wrapperNum.intValue();
            System.out.println("Primitive values" + num);
            System.out.println("Wrapper values" + wrapperNum);
            System.out.println("Unboxed values" + unboxedNum);


        }
}
