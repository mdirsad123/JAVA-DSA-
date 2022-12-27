package java_DSA_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Intersection_arrays {
    public static List<Integer> intersection(int nums[][]){
        int n=nums.length;
        HashSet<Integer> hp1=new HashSet<>();
        for(int j=0;j<nums[0].length;j++){
            hp1.add(nums[0][j]);
        }
        for(int i=1;i<n;i++){
            HashSet<Integer> hp2=new HashSet<>();
            for(int j=0;j<nums[i].length;j++){
                hp2.add(nums[i][j]);
            }
            hp1.retainAll(hp2);
        }
        List<Integer> arr=new ArrayList<>(hp1);
        Collections.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        int nums[][]={{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println(intersection(nums));
    }
}
