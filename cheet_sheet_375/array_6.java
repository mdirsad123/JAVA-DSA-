package cheet_sheet_375;
public class array_6 {
    public static int search(int arr[], int key){
        int low=0;
        int high= arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==key){
                return mid;
            }
            if (arr[low]<arr[mid]){
                if (key>=arr[low] && key<arr[mid]){
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            else {
                if (key>arr[mid] && key<=arr[high]){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,3};
        int key=6;
        System.out.println("The "+key+" index is :"+ search(arr,key));
    }
}