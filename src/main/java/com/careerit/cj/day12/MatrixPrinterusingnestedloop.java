package com.careerit.cj.day12;
import java.util.*;

public class MatrixPrinterusingnestedloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int rowSize = sc.nextInt();
        System.out.println("Enter the col size: ");
        int colSize = sc.nextInt();
        int matrix[][] = new int[rowSize][colSize];
        System.out.println("Enter the elements of the matrix : ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print("Enter the element for row "+(i+1)+" and column "+(j+1)+":");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(" The matrix you entered is : ");
        for(int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
