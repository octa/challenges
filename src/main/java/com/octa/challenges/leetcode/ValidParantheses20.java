package com.octa.challenges.leetcode;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
 */

import java.util.Stack;

public class ValidParantheses20 {

    public static void main(String[] args) {
        String a = "()";

        boolean b = isValid(a);
        System.out.println(b);

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack();
        for(int i=0; i<s.length(); i++) {

            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else if(!stack.isEmpty() && (s.charAt(i) == ')' && stack.peek()=='(' || s.charAt(i) == '}' && stack.peek()=='{' || s.charAt(i) == ']' && stack.peek()=='[')) {
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.empty();
    }

    /*public static boolean isValid(String s) {

        Stack stack = new Stack();
        for(int i=0; i<s.length(); i++) {

            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') stack.push(s.charAt(i));

            switch(s.charAt(i)) {
                case ')':
                    if(stack.isEmpty()) return false;
                    if ((char)stack.peek()=='(') {
                        stack.pop();
                        break;
                    }
                    return false;
                case '}':
                    if(stack.isEmpty()) return false;
                    if ((char)stack.peek()=='{') {
                        stack.pop();
                        break;
                    }
                    return false;
                case ']':
                    if(stack.isEmpty()) return false;
                    if ((char)stack.peek()=='[') {
                        stack.pop();
                        break;
                    }
                    return false;
            }
        }
        return stack.empty();
    }*/

}
