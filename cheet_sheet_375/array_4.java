package cheet_sheet_375;

import java.util.Arrays;

public class array_4 {
    public static boolean contains_dub(int arr[]){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        boolean s=contains_dub(arr);
        System.out.println(s);
    }
}
