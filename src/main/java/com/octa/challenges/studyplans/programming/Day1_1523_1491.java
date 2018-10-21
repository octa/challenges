package com.octa.challenges.studyplans.programming;

import java.util.Arrays;

public class Day1_1523_1491 {

    public static void main(String[] args) {

        int count = countOdds(3,7);
        System.out.println(count);

        int[] salary = {4000,3000,1000,2000};
        double average = average(salary);
        System.out.println(average);
    }

/*
Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

Example 1:

Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].
     */
    public static int countOddsWithFor(int low, int high) {
        int count = 0;
        for(int i=low; i<=high; i++) {
            if(i%2!=0) {
                count++;
            }
        }
        return count;
    }

    public static int countOdds(int low, int high) {
        return (high+1)/2 - low/2;
    }
/*
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.



Example 1:

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
 */
    public static double averageWithFor(int[] salary) {
        Arrays.sort(salary);
        int sum=0;
        for(int i=1; i<salary.length-1; i++) {
            sum += salary[i];
        }
        return (double) sum/(salary.length-2);
    }

    public static double average(int[] salary) {
        //Arrays.sort(salary);
        int sum=0;
        return (double) (Arrays.stream(salary).parallel().sum()-Arrays.stream(salary).parallel().min().getAsInt()-Arrays.stream(salary).parallel().max().getAsInt())/(salary.length-2);
    }
}
