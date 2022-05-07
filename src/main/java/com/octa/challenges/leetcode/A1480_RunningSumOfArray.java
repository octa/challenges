package com.octa.challenges.leetcode;

import java.util.Arrays;

public class A1480_RunningSumOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] sum = runningSum(nums);
        Arrays.stream(sum).forEach(System.out::println);
    }
    public static int[] runningSum(int[] nums) {
        int[] returnArray = new int[nums.length];
        returnArray[0] = nums[0];;
        for(int i=1; i<nums.length;i++) {
            returnArray[i] = returnArray[i-1] + nums[i];
        }
        return returnArray;
    }
}
