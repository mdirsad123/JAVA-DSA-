package cheet_sheet_375;

public class array_14 {
    public static int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(nums[m]>nums[e]){
                s=m+1;
            }
            else{
                e=m;
            }
        }
        return nums[s];
    }

    public static void main(String[] args) {
        int nums[]={3,4,5,5,11,2,1};
        System.out.println(findMin(nums));
    }
}
