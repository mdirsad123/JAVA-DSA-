package cheet_sheet_375;

public class array_17 {
    public static int maxarea(int arr[]){
        int left=0;
        int right=arr.length-1;
        int max=0;
        while (left<right){
            int leftH=arr[left];
            int rightH=arr[right];
            int min_h=Math.min(leftH,rightH);
            int length=right-left;
            int curr_area= min_h*length;
            max=Math.max(max,curr_area);
            if (leftH<rightH) left++;
            else right--;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(maxarea(arr));
    }
}
