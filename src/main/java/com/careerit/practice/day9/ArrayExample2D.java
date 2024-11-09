package com.careerit.practice.day9;

import java.util.Arrays;

public class ArrayExample2D {
    public static void main(String[] args){
        int[][] arr = new int[][]{{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7},{4,5,6,7,8}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(Arrays.toString(sumOfEachRow(arr)));
        System.out.println(Arrays.toString(sumOfEachCol(arr)));
    }

    public static int[] sumOfEachCol(int[][] arr){
        int numsRow = arr.length;
        int numsCol = arr[0].length;
        int[] colSum = new int[numsCol];
        for(int col=0;col<numsCol;col++){
            int sum = 0;
            for(int row=0;row<numsRow;row++){
                sum += arr[row][col];
            }
            colSum[col] = sum;
        }
        return colSum;
    }

    public static int[] sumOfEachRow(int[][] arr){
        int numsRow = arr.length;
        int numsCol = arr[0].length;
        int[] rowSum = new int[numsRow];
        for(int row = 0;row<numsRow;row++){
            int sum = 0;
            for(int col=0;col<numsCol;col++){
                sum += arr[row][col];
            }
            rowSum[row] = sum;
        }
        return rowSum;

    }
}
