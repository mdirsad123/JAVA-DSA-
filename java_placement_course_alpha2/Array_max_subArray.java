package java_placement_course_alpha2;

public class Array_max_subArray {
    public static void maxSum(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currSum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    currSum +=arr[k];
                }
                System.out.println(currSum);
                if (maxsum<currSum){
                    maxsum=currSum;
                }
            }
        }
        System.out.println("max sum of array is "+maxsum);
    }
    public static void maxSumArray(int arr[]){
        int max=Integer.MIN_VALUE;
        int cs=0;
        for (int i = 0; i < arr.length; i++) {
            cs +=arr[i];
            if (cs<0){
                cs=0;
            }
        }
        max=Math.max(max,cs);
        System.out.println("max sub array is "+max);
    }
    public static void main(String[] args) {
        int arr[]={4,3,5,7,4,8};
//        maxSum(arr);
        maxSumArray(arr);
    }
}
