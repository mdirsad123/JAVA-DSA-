package sorting_algorithm_practice;

public class Array_practice {
    public static void linearSearch(int arr[],int k){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==k){
                System.out.println("find this index is "+i);
            }
        }
    }
    public static void largestArray(int ar[]){
        int lar=Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (lar<ar[i]){
                lar=ar[i];
            }
        }
        System.out.println("the largest elements is "+lar);
    }
    public static void reverse(int arr[]){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,6,8,1,34};
        int k=4;
//        linearSearch(arr,k);
//        largestArray(arr);
        reverse(arr);
    }
}
