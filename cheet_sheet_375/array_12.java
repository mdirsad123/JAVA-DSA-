package cheet_sheet_375;
import java.util.Arrays;
public class array_12 {
    public static int[] productExceptSelf(int a[]) {
        int n=a.length;
        int output_arr[]=new int[n];
        output_arr[0]=1;
        for (int i = 1; i < n; i++) {
            output_arr[i]=a[i-1]*output_arr[i-1];
        }
        int r=1;
        for (int i = n-1; i >=0 ; i--) {
            output_arr[i]=output_arr[i]*r;
            r=r*a[i];
        }
        return output_arr;
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(a)));
    }
}
