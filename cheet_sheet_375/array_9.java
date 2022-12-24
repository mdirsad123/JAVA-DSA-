package cheet_sheet_375;
public class array_9 {
    static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void getTwoElements(int[] arr, int n)
    {
        int repeating = 0;
        int missing = 0;
        int i = 0;
        while (i < n) {
            if (arr[i] ==  arr[arr[i] - 1 ]) {
                i++;
            }
            else {
                if (arr[i] != arr[arr[i] - 1]) {
                    swap(arr, i, arr[i] - 1);
                }
                else {
                    i++;
                }
            }
        }
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                repeating = arr[i];
                missing = i + 1;
                break;
            }
        }
        System.out.println("Repeating: " + repeating + "Missing: " + missing);
    }
    public static void main(String[] args)
    {
        int[] arr = { 2, 3, 1, 5, 1 };
        int n = arr.length;
        getTwoElements(arr, n);
    }
}
