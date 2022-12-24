package cheet_sheet_375;

import java.util.Arrays;
public class string_2 {
    public static boolean valid_anag(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int counts_char[]=new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts_char[s.charAt(i)-'a']++;
            counts_char[t.charAt(i)-'a']--;
        }
        for (int count : counts_char){
            if (count !=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(valid_anag(s,t));
    }
}
