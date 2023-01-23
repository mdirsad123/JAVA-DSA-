package java_placement_course_alpha2;

import java.util.Arrays;

public class String_anagram {
    public static boolean anagram(String str1, String str2){
        str1.toLowerCase();
        str2.toLowerCase();
        if (str1.length()==str2.length()){
            char[] char1Arr=str1.toCharArray();
            char[] char2Arr=str2.toCharArray();

            Arrays.sort(char1Arr);
            Arrays.sort(char2Arr);

            Boolean result=Arrays.equals(char1Arr,char2Arr);
            if (result){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str1="carers";
        String str2="arecsr";
        System.out.println(anagram(str1,str2));
    }
}
