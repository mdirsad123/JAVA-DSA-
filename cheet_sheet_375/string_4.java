package cheet_sheet_375;

public class string_4 {
    public static String rem_cons_char(String s){
        int n=s.length();
        String result="";
        for (int i = 0; i < n; i++) {
            if (i<n-1 && s.charAt(i)==s.charAt(i+1)){
                continue;
            }
            else {
                result+=s.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s="aabcdd";
        System.out.println(rem_cons_char(s));
    }
}
