package cheet_sheet_375;

public class array_3 {
    public static int maxProduct(int[] nums,int n) {
        int max=nums[0];
        int min=max;
        int ans=max;
        for(int i=1; i<n;i++){
            if(nums[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(nums[i],max*nums[i]);
            min=Math.min(nums[i],min*nums[i]);
            ans=Math.max(max,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={-4,-3};
        int n=nums.length-1;
        System.out.println(maxProduct(nums,n));
    }
}
