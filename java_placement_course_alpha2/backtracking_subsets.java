package java_placement_course_alpha2;

public class backtracking_subsets {
    public static void subsets(String str, String ans, int i){
        //base case
        if (i==str.length()){
            System.out.println(ans);
            return;
        }
        //recursion
        //yes
        subsets(str,ans+str.charAt(i),i+1);
        //no
        subsets(str,ans,i+1);

    }
    public static void main(String[] args) {
        String str="abc";
        subsets(str,"",0);
    }
}
