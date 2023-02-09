package main.java;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";

        ValidParentheses parentheses = new ValidParentheses();
        System.out.println(parentheses.isValid(input1));
        System.out.println(parentheses.isValid(input2));
        System.out.println(parentheses.isValid(input3));
    }

    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                parentheses.push(ch);
            } else {
                char matchOpn = '0';
                switch (ch) {
                    case ')':
                        matchOpn = '(';
                        break;
                    case ']':
                        matchOpn = '[';
                        break;
                    case '}':
                        matchOpn = '{';
                        break;
                }
                if (parentheses.isEmpty() || parentheses.pop() != matchOpn) {
                    return false;
                }
            }
        }

        return parentheses.isEmpty();
    }

}
