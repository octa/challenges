package com.octa.challenges.leetcode;

public class A7_ReverseInteger {

    public static void main(String[] args) {

        int i = 121;
        System.out.println(reverse(i));

    }

    public static int reverse(int x) {

        int reverse = 0;

        while(x !=0) {
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && x%10 > 7)) return 0;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && x%10 < -8)) return 0;
            reverse = reverse*10 + x%10;
            x = x/10;
        }

        return reverse;
    }

}
