package cheet_sheet_375;

public class array_15 {
    public static int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int m=(s+e)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[s]<=nums[m]){
                if(nums[s]<=target && target<=nums[m]){
                    e=m-1;

                }
                else{
                    s=m+1;
                }
            }
            else{
                if(nums[m]<=target && target<=nums[e]){
                    s=m+1;
                }
                else{
                    e=m-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }
}
