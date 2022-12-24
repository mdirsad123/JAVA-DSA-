package cheet_sheet_375;

public class search_sort_4 {
    public static int search_diff_k(int arr[],int n,int x,int k){
        int i=0;
        while (i< n){
            if (arr[i]==x) {
                return i;
            }
            i=i+Math.max(1,Math.abs(arr[i]-x)/k);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,6,8,9,11};
        int n= arr.length;
        int x=2;
        int k=3;
        System.out.println(search_diff_k(arr,n,x,k));
    }
}
