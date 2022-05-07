package com.octa.challenges.leetcode;

public class A1920_ArrayPermutation {
    public int[] buildArray(int[] nums) {
        int[] returnArray = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            returnArray[i] = nums[nums[i]];
        }
        return returnArray;
    }
}
