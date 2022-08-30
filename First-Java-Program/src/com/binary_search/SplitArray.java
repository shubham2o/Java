package com.binary_search;

public class SplitArray {
    /* Split Array Largest Sum
    Given an array nums which consists of non-negative integers and an integer m, you can split the array into m
    non-empty continuous sub-arrays.
    Write an algorithm to minimize the largest sum among these m sub-arrays.

    Example 1:
    Input: nums = [7, 2, 5, 10, 8], m = 2
    Output: 18
    Explanation:
    There are four ways to split nums into two sub-arrays. The best way is to split it into [7, 2, 5] and [10, 8],
    where the largest sum among the two sub-arrays is only 18.

    Example 2:
    Input: nums = [1, 2, 3, 4, 5], m = 2
    Output: 9

    Example 3:
    Input: nums = [1, 4, 4], m = 3
    Output: 4 */

    public static void main(String[] args) {
        // Example 1:
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(splitArray(nums, m));

        // Example 2:
        int[] nums2 = {1, 2, 3, 4, 5};
        int m2 = 2;
        System.out.println(splitArray(nums2, m2));

        // Example 3:
        int[] nums3 = {1, 4, 4};
        int m3 = 3;
        System.out.println(splitArray(nums3, m3));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);  // In the end of the loop this will contain the max item of the array
            end += nums[i];
        }

        // Binary Search
        while (start < end) {
            // Try for the middle as potential ans
            int mid = start + (end - start) / 2;
            // Calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // You cannot add this in this sub-array, make new one
                    // Say you add this num in new sub-array, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // Here start == end
    }
}