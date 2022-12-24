package cheet_sheet_375;

public class array_13 {
    public static int maxProd_subarr(int arr[]){
        int maxprod=0;
        int currprod=1;
        for (int i = 0; i < arr.length; i++) {
            currprod=currprod*arr[i];
            if (maxprod<currprod){
                maxprod=currprod;
            }
            if (currprod<0){
                return currprod;
            }
        }
        return maxprod;
    }

    public static void main(String[] args) {
        int arr[]={-4,-3};
        System.out.println(maxProd_subarr(arr));
    }

}
