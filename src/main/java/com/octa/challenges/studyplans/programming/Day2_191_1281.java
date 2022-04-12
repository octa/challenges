package com.octa.challenges.studyplans.programming;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day2_191_1281 {

    public static void main(String[] args) {

        int num = 234;
        int result = subtractProductAndSum(num);
        System.out.println(result);

        int n = 00000000000000000000000000001011;
        int count = hammingWeight(n);
        System.out.println(count);

    }

/*
Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

Note:

Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.

Example 1:

Input: n = 00000000000000000000000000001011
Output: 3
Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
 */

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
        //return n==0? 0: hammingWeight(n/2) + (n&1);
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
