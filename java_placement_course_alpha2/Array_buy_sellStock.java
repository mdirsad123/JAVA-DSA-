package java_placement_course_alpha2;

public class Array_buy_sellStock {
    public static int stockSellBuy(int arr[]){
        int butPrice=Integer.MAX_VALUE;
        int profit=0;
        for (int i = 0; i < arr.length; i++) {
            if (butPrice<arr[i]){
                int currProfit=arr[i]-butPrice;
                profit=Math.max(profit,currProfit);
            }
            else {
                butPrice=arr[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={4,5,3,23,55,1};
        System.out.println(stockSellBuy(arr));

    }
}
