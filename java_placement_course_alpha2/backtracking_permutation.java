package java_placement_course_alpha2;

public class backtracking_permutation {
    public static void permutation(String str, String ans){
        //base case
        if (str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
            //"abcde" => "ab" + "de"
            String Newstr=str.substring(0,i)+str.substring(i+1);
            permutation(Newstr,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        permutation(str,"");

    }
}
