package cheet_sheet_375;

import java.util.ArrayList;

public class search_sort_3 {
    public static ArrayList com_elem_3arr(int[] arr1, int[] arr2, int[] arr3){
        ArrayList al=new ArrayList();
        int i=0,j=0,k=0;
        while (i<arr1.length && j<arr2.length && k<arr3.length){
            if (arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                al.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if (arr1[i]<arr2[j]){
                i++;
            }
            else if (arr2[j]<arr3[k]){
                j++;
            }
            else {
                k++;
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={5,6,7,8};
        int arr3[]={5,6};
        System.out.println(com_elem_3arr(arr1,arr2,arr3));
    }
}
