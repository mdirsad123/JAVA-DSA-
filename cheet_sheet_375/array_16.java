package cheet_sheet_375;

import java.util.*;

public class array_16 {
    public static List<List<Integer>> threesum(int nums[]){
        Set<List<Integer>> res=new HashSet<>();
        if (nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int j=i+1;
            int k= nums.length-1;
            while (j<k){
                int sum=nums[j]+nums[k];
                if (sum== -nums[i]){
                    res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }
                else if (sum>= nums[i]) k--;
                else if (sum<=nums[i]) j++;
            }
        }
        return new ArrayList<>(res);
    }
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(threesum(nums));
    }
}
