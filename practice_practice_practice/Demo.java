package practice_practice_practice;

import java.util.*;

public class Demo {

    public static void reverse(int arr[]){
            int start=0;
            int end= arr.length-1;
            while (start<end){
                //swap
                int swap=arr[start];
                arr[start]=arr[end];
                arr[end]=swap;
                start++;
                end--;
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void subArray(int arr[]){
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                for (int k = i; k < j; k++) {
                    System.out.print(arr[k]+" ");
                    tp++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void pairArray(int arr[]){
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("("+arr[i]+")"+" ("+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void maxSubArray1(int arr[]){
        int max = Integer.MIN_VALUE;
        
    }

    public static void main(String[] args) {
        int arr[]={2,3,1,4,6,4,3};
        maxSubArray1(arr);
    }
}
