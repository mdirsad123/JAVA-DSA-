package java_placement_course_alpha2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Indian_coins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());

        int CountOfCoins=0;
        int amount=9;
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i]<=amount){
                while (coins[i]<=amount){
                    CountOfCoins++;
                    ans.add(coins[i]);
                    amount -=coins[i];
                }
            }
        }
        System.out.println("total min coins used = "+CountOfCoins);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
