package cheet_sheet_375;

import java.util.Stack;

public class string_3 {
    public static boolean valid_pranth(String s) {

        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);

            } else {
                if (stack.isEmpty()) return false;
                if (c == ']' && stack.peek() != '[') return false;
                if (c == ')' && stack.peek() != '(') return false;
                if (c == '}' && stack.peek() != '{') return false;

                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(]})}[";
        System.out.println(valid_pranth(s));
    }
}
