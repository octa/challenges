package com.octa.challenges.leetcode;

import java.util.Arrays;

public class A1929_ConcatenationOfArray {

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        A1929_ConcatenationOfArray concatenationOfArray = new A1929_ConcatenationOfArray();
        int[] array = concatenationOfArray.getConcatenation(nums);
        System.out.println(Arrays.toString(array));
    }

    public int[] getConcatenation(int[] nums) {
        int[] array = new int[nums.length*2];
        for(int i=0; i<nums.length; i++) {
            array[i] = nums[i];
            array[i+nums.length] = nums[i];
        }
        return array;
    }
}
