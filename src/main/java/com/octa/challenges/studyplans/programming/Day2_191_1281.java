package com.octa.challenges.studyplans.programming;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day2_191_1281 {

    public static void main(String[] args) {

        int num = 234;
        int result = subtractProductAndSum(num);
        System.out.println(result);

    }
/*
Given an integer number n, return the difference between the product of its digits and the sum of its digits.

Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
 */
    public static int subtractProductAndSums(int n) {
        Stream.of(n).forEach(System.out::println);
        return 0;
    }
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int drain;
        while(n!=0) {
            drain = n%10;
            product = product * drain;
            sum = sum + drain;
            n = n/10;
        }
        return product - sum;
    }
}
