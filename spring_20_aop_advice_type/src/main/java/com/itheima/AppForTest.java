package com.itheima;

import java.util.Stack;

public class AppForTest {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            if(ch == ')' || ch == ']' || ch == '}') {
                if (stack.empty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{')) {
                    i++;
                    continue;
                } else {
                    return false;
                }
            }
            i++;
        }
        return stack.empty();
    }
}
