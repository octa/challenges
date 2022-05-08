package com.octa.challenges.leetcode;

public class A1528_ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] ret = new char[indices.length];
        for(int i=0; i<indices.length; i++) {
            ret[indices[i]] = s.charAt(i);
        }
        return new String(ret);
    }
}
