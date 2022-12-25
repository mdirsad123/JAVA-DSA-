package java_placement_course_alpha2;

import java.util.Arrays;

public class Minimum_abs_difference {
    public static void main(String[] args) {
        int arr1[]={4,1,8,7};
        int arr2[]={2,3,6,5};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minDiff=0;
        for (int i = 0; i < arr1.length; i++) {
            minDiff +=Math.abs(arr1[i]-arr2[i]);
        }
        System.out.println("absolute diff is = "+minDiff);
    }
}
