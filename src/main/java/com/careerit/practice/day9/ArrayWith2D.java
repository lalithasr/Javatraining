package com.careerit.practice.day9;

public class ArrayWith2D {

    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 6 }, { 3, 4, 5, 6, 7 }, { 4, 5, 6, 7, 8 } };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}