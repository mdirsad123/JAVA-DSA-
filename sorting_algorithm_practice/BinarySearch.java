package sorting_algorithm_practice;

public class BinarySearch {
    public static int binary(int nums[],int target){
        int first=0;
        int end=nums.length-1;
        while(first<=end){
            int mid=(first+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end=mid-1;
            }
            else{
                first=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={5};
        int target=-5;
        System.out.println(binary(nums,target));
    }
}
