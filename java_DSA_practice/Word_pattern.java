package java_DSA_practice;

import java.util.HashMap;

public class Word_pattern {
    public static boolean wordPattern(String pattern, String s){
        String[] strs = s.split(" ");
        if(strs.length!=pattern.length())
            return false;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i = 0; i < pattern.length() ; i++){
            char c = pattern.charAt(i);
            if(map.put(c + " ",i) != map.put(strs[i],i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern="adda";
        String s="dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
}
