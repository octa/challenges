package com.octa.challenges.studyplans.datastructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day1_217_53 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean contains = containsDuplicate(nums);
        System.out.println(contains);
    }

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
     */
    public static boolean containsDuplicateStream(int[] nums) {
        return !Arrays.stream(nums).allMatch(new HashSet<>()::add);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();

        for (int num: nums){
            if (!set.add(num))
                return true;
        }
        return false;
    }

/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */

    public int maxSubArray(int[] nums) {
        return 0;
    }
}
