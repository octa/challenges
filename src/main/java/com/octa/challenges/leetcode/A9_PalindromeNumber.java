package com.octa.challenges.leetcode;

/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.


Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
 */
public class A9_PalindromeNumber {

    public static void main(String[] args) {

        int i = 121;
        System.out.println(isPalindrome(i));

    }

    public static boolean isPalindrome(int x) {

        int orginalx = x;
        int reverse = 0;

        if(x<0) {
            return false;
        }

        while(x !=0) {
            reverse = reverse*10 + x%10;
            x = x/10;
        }
        boolean ret = reverse == orginalx?true:false;
        return ret;
    }

}
