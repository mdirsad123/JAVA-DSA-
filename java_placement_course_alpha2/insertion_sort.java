package java_placement_course_alpha2;

public class insertion_sort {
    public static void main(String[] args) {
        int arr[]={2,4,5,3,1};
        for (int i = 1; i < arr.length-1; i++) {
            int curr=arr[i];
            int prev=i-1;
            while (prev >= 0 && arr[prev] > arr[curr]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=arr[curr];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
