package com.octa.challenges.leetcode;

import java.util.Arrays;

public class A1672_RichestWealth {
    public static void main(String[] args) {
        int[][] customer = new int[][]{{1,2,3},{3,2,1}, {3,2,1}, {3,2,1}, {3,2,1}};
        System.out.println(maximumWealth(customer));
    }
    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int ret = 0;
        for(int i=0; i<accounts.length;i++) {
            sum = Arrays.stream(accounts[i]).sum();
            if(sum>ret) {
                ret = sum;
            }
        }
        return ret;
    }
}
