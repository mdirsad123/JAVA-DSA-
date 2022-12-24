package java_placement_course_alpha2;

import java.util.ArrayList;

public class Arraylist_PairSum1 {
    public static boolean PairSum1(ArrayList<Integer> list,int target){
        int lp=0;
        int rp= list.size()-1;
        while (lp<rp){
            if (list.get(lp)+list.get(rp)==target){
                return true;
            } else if (list.get(lp)+list.get(rp)<target) {
                lp++;
            }
            else {
                rp--;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);

        int target=60;
        System.out.println(PairSum1(list,target));

    }
}
