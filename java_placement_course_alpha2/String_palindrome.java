package java_placement_course_alpha2;

public class String_palindrome {
    public static boolean isPalindrome(String s){
        if (s.length()==0){
            return true;
        }
        for (int i = 0; i < s.length()/2; i++) {
            int n=s.length();
            if (s.charAt(i) != s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="";
        System.out.println(isPalindrome(s));

    }
}
