package com.careerit.practice.day9;

public class PatternPrinting {

        public static void main(String[] args) {
            int[][] arr = new int[][]{{1,0,0,0,0},{1,0,0,0,0},{1,0,0,0,0},{1,1,1,1,1}};
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    if(arr[i][j] == 1) {
                        System.out.print("L ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
}
