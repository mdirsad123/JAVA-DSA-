package java_placement_course_alpha2;

import java.util.Arrays;
import java.util.Collections;

public class Chocolate_problem {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;
        while (h<costHor.length && v<costVer.length){
            if (costVer[v]<=costHor[h]){
                cost +=(costHor[h]*vp);
                hp++;
                h++;
            }
            else {
                cost +=(costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while (h<costHor.length){
            cost +=(costHor[h]*vp);
            hp++;
            h++;
        }
        while (v<costVer.length){
            cost +=(costVer[v]*hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cut = "+cost);
    }
}
