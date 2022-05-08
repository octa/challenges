package com.octa.challenges.leetcode;

import java.util.Arrays;

public class A1470_ShuffeArray {
    public static void main(String[] args) {
        int n = 3;
        int[] nums = {2,5,1,3,4,7};
        int[] ret = shuffle(nums, n);
        Arrays.stream(ret).forEach(System.out::println);
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ret = new int[nums.length];
        int num = 0;
        for(int i=0; i<n;i++) {
            ret[num++] = nums[i];
            ret[num++] = nums[i+n];
        }
        return ret;
    }
}
