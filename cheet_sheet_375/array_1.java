package cheet_sheet_375;

public class array_1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 1, 9, 45,2,1,411,0};
        // find maximum element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("maximum value is :"+max);
        // find minimum value
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("minimum value is :"+min);
    }
}
