package cheet_sheet_375;

public class array_8 {
    public static int max_profit(int arr[]){
        int maxprofit=0;
        int minsofar=arr[0];
        for (int i = 0; i < arr.length; i++) {
            minsofar=Math.min(minsofar,arr[i]);
            int profit=arr[i]-minsofar;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={2,3,23,5,67};
        System.out.println(max_profit(arr));
    }
}
