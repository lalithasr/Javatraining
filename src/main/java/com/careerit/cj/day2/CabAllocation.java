package com.careerit.cj.day2;

public class CabAllocation {
    public static void main(String args[]){
        int peopleCount = 99875;
        int cabCapacity = 5;
        int cabCount = peopleCount/cabCapacity;
        int remaingperson = peopleCount % cabCapacity;
        System.out.println("Cabs needed for people " + cabCount);
        System.out.println("Remaining people left after the cab filled "+remaingperson);
        if(remaingperson > 0) {
            cabCount = cabCount+1;
            System.out.println("Total Cabs needed "+ cabCount);
        }
        System.out.println("Total cabs needed"+cabCount);
    }
}
