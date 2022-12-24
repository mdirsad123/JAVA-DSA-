package java_placement_course_alpha2;

import java.util.*;

public class Arraylist_sort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        System.out.println("array list element");
        System.out.println(list);
        //ascending order
        Collections.sort(list);
        System.out.println("ascending order list");
        System.out.println(list);

        //descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("descending order list");
        System.out.println(list);
    }
}
