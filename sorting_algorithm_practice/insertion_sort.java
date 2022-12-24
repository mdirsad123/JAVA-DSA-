package sorting_algorithm_practice;
public class insertion_sort {
    public static void bubble_sort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={8,7,3,1,2};
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        bubble_sort(arr);
    }
}
