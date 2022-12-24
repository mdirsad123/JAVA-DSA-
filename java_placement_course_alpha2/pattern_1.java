package java_placement_course_alpha2;

public class pattern_1 {
    public static void subsets(String str, String ans, int i){
//        base case
        if (i==str.length()){
            System.out.println(ans+" ");
            return;
        }

//        recursion task
//        yes choice
        subsets(str,ans+str.charAt(i),i+1);
//        no choice
        subsets(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        subsets(str,"",0);
    }
}
