package java_placement_course_alpha2;

public class bubble_sort {
    public static void bubble(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void selection_sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minpos=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void insertion(int arr[]){

        for (int i = 1; i < arr.length-1; i++) {
            int curr=arr[i];
            int prev=i-1;
            while (prev >=0 && arr[prev] > arr[curr]){
                arr[prev+1]=arr[prev];
                prev--;

            }
            arr[prev+1]=arr[curr];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,5,4,3,2};
        insertion(arr);
    }
}
