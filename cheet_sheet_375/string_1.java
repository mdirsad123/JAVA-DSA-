package cheet_sheet_375;

import java.util.Locale;

public class string_1 {
    public static boolean valid_plind(String s){
        s=s.toLowerCase();
        StringBuilder b=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                b.append(s.charAt(i));
            }
        }
        int n=b.length()-1;
        for (int i = 0; i < b.length()/2; i++) {
            if (b.charAt(i)!=b.charAt(n-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="ab$%   aba";
        System.out.println(valid_plind(s));
    }
}
