package java_placement_course_alpha2;

import java.util.ArrayList;

public class Arraylist_containMax_water {
    //time complexity is o(n^2) bruite force
    public static int containwater(ArrayList<Integer> list){
        int max=0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                int ht=Math.min(list.get(i),list.get(j));
                int width=j-i;
                int currwater=ht*width;
                max=Math.max(currwater,max);
            }
        }
        return max;
    }
//    tc=o(n) linear tc
    public static int containerWater(ArrayList<Integer> height){
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;
        while (lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currwater=ht*width;
            maxwater=Math.max(currwater,maxwater);
            if (height.get(lp)<height.get(rp)){
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(9);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(8);
        System.out.println(containerWater(list));

    }
}
