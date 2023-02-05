package java_placement_course_alpha2;

import java.util.Scanner;

public class Arrays_2D {
    public static int diagonal(int matrix[][]){
        //primary
        int sum=0;
//        int secondSum=0;
//        int finalSum;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (i==j){
//                    sum +=matrix[i][j];
//                }
//            }
//        }
//        //secondary
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (i+j== matrix.length-1){
//                    secondSum +=matrix[i][j];
//                }
//            }
//        }
        for (int i = 0; i < matrix.length; i++) {
            sum +=matrix[i][i];
            if (i != matrix.length-1-i){
                sum +=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static boolean search(int matrix[][],int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==key){
                    System.out.println("key is cell no ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
//        System.out.println(search(matrix,7));
        System.out.println(diagonal(matrix));
    }
}
