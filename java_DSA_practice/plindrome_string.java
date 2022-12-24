package java_DSA_practice;

public class plindrome_string {
    public static void main(String[] args) {
        String s="madam";
        String result="";
        for (int i = s.length()-1; i >= 0; i--) {
            result+=s.charAt(i);
        }
        System.out.println(result);
        if (s.equals(result)){
            System.out.println(" String is plindrome ");
        }
        else {
            System.out.println("string is not plindrome ");
        }
    }
}
