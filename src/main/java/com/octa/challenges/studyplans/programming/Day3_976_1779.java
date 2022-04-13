package com.octa.challenges.studyplans.programming;

import java.util.Arrays;

public class Day3_976_1779 {

    public static void main(String[] args) {

        //int[] nums = {1,2,2,4,18,8};
        int[] nums = {1,2,1};
        int result = largestPerimeter(nums);
        System.out.println(result);
    }

/*
Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.

Example 1:

Input: nums = [2,1,2]
Output: 5
 */
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int perimeter = nums[length-1] + nums[length-2] + nums[length-3];
        double semiPerimeter = (double)perimeter/2;
        double area = 0.0;
        if(length==3) {
            area = Math.sqrt(semiPerimeter * (semiPerimeter - nums[length - 1]) * (semiPerimeter - nums[length - 2]) * (semiPerimeter - nums[length - 3]));
            return area>0.0?perimeter:0;
        }
        for(int i=nums.length; i>3; i--) {
            perimeter = nums[i-1] + nums[i-2] + nums[i-3];
            semiPerimeter = (double)perimeter/2;
            if(semiPerimeter < nums[i-1] || semiPerimeter < nums[i-2] || semiPerimeter < nums[i-3]) {
                continue;
            }
            if((semiPerimeter - nums[i-1] == 0 || semiPerimeter - nums[i-2] == 0 || semiPerimeter - nums[i-3] == 0)) {
                i--;
                perimeter = nums[i-1] + nums[i-2] + nums[i-3];
                semiPerimeter = (double)perimeter/2;
                area =  Math.sqrt(semiPerimeter*(semiPerimeter - nums[i-1]) * (semiPerimeter - nums[i-2]) * (semiPerimeter - nums[i-3]));
                if(area<=0.0 && i>= 3) continue; else return perimeter;
            }
            else {
                perimeter = nums[i-1] + nums[i-2] + nums[i-3];
                semiPerimeter = (double)perimeter/2;
                area = Math.sqrt(semiPerimeter * (semiPerimeter - nums[i - 1]) * (semiPerimeter - nums[i - 2]) * (semiPerimeter - nums[i - 3]));
                if(area>0.0) return perimeter;
            }
        }

        return 0;
    }
}
