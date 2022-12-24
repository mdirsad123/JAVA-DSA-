package java_placement_course_alpha2;

import java.util.Stack;

public class Stack_duplicate_prenthesis {
    public static Boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
                char ch=str.charAt(i);

                //closing
            if (ch==')'){
                int count=0;
                while (s.peek()!='('){
                    s.pop();
                    count++;
                }
                if (count<1){
                    return true;
                }
                else {
                    s.pop();
                }

            }
            else {
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="((a+b))";//true
        String str2="((a+b)+(c))";//false
        System.out.println(isDuplicate(str2));
    }
}
