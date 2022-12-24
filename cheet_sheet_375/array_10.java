package cheet_sheet_375;

public class array_10 {
    public static void kth_largestelement(int arr[], int k){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if (i==k-1){
                System.out.println("the "+k+"th largest element is :"+arr[i]);
            }
        }
        System.out.println("sorted array is ");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,445,3,32};
        int k=1;
        kth_largestelement(arr,k);
    }
}
