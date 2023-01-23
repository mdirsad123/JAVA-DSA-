package java_placement_course_alpha2;

import java.util.Scanner;

public class String_count_lowercaseByUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("lowercase vowel entered by the user "+count);
    }
}
