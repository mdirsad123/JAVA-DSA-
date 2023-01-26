package java_placement_course_alpha2;

import java.util.Arrays;

public class Array_binarySearch {
    public static int binarySearch(int arr[],int k){
        int first=0;
        int last= arr.length-1;
        while (first<=last){
            int mid=(first+last)/2;
            if (arr[mid]==k){
                return mid;
            }
            if (arr[mid]>k){
                last=mid-1;
            }
            else {
                first=mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,77,89};
        int k=77;
        System.out.println(binarySearch(arr,k));
    }
}
