package cheet_sheet_375;

import java.util.Arrays;

public class array_5 {
    public static int chocolatedus(int arr[], int n, int m){
        if (n == 0 || m == 0){
            return 0;
        }
        Arrays.sort(arr);
        if (n<m){
            return -1;
        }
        int min_diff=Integer.MAX_VALUE;
        for (int i = 0; i+m-1 < n; i++) {
            int diff=arr[i+m-1]-arr[i];
            if (diff<min_diff){
                min_diff=diff;
            }
        }
        return min_diff;
    }
    public static void main(String[] args) {
        int arr[]={12, 4, 7, 9, 2, 23,
                25, 41, 30, 40, 28,
                42, 30, 44, 48, 43};
        int n= arr.length;
        int m=7;
        System.out.println("The min difference is :"+ chocolatedus(arr,n,m));
    }
}