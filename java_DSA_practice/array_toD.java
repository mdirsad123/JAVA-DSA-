package java_DSA_practice;

import java.util.Scanner;

public class array_toD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter total number of row and colum :");
        int row= sc.nextInt();
        int colum= sc.nextInt();
        int[][] mat=new int[row][colum];
        System.out.print("enter index of row and colum :");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                mat[i][j]= sc.nextInt();
            }
        }
        System.out.print("search of x index :");
        int x= sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (x==mat[i][j]){
                    System.out.print("x index found at location ("+i+","+j+")");
                }

            }
            System.out.println();
        }
    }
}
