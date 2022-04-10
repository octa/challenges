package com.octa.challenges.leetcode;

import java.util.Arrays;

public class CommonLongestPrefix14 {

    public static void main(String[] args) {

        String[] input = {"flower","flow","flight"};
        String prefix = longestCommonPrefix(input);
        System.out.println(prefix);

    }

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        int length = Math.min(strs[0].length(), strs[strs.length-1].length());

        int i = 0;
        while(i < length && strs[0].charAt(i)==strs[strs.length-1].charAt(i)) {
            i++;
        }

        String prefix = strs[0].substring(0, i);

        return prefix;

    }

}
