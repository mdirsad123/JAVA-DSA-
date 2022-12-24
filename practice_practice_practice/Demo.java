package practice_practice_practice;

import java.util.*;

public class Demo {
   public static void selection(int arr[]){
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
   }

    public static void main(String[] args) {
        int arr[]={2,23,1,2,32,44,4,23,5};
        for (int i = 0; i < arr.length-1; i++) {
            int smallest=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int swap=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=swap;
        }
        selection(arr);
    }
}
