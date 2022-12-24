package cheet_sheet_375;

public class string_5 {
    public static String long_com_prefix(String[] strs){
        if (strs.length==0) return "";
        String prefix=strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        System.out.println(long_com_prefix(strs));
    }
}
