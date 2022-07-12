package com.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastPosition {
    /* Find First and Last Position of Element in Sorted Array
    Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target
    value.
    If target is not found in the array, return [-1, -1].
    You must write an algorithm with 0(log n) runtime complexity.

    Example 1:
    Input: nums = [5, 7, 7, 8, 8, 10], target = 8
    Output: [3, 4]

    Example 2:
    Input: nums = [5, 7, 7, 8, 8, 10], target = 6
    Output: [-1, -1]

    Example 3:
    Input: nums = [], target = 0
    Output: [-1, -1] */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(nums));

        int target = in.nextInt();
        int[] output = searchRange(nums, target);
        System.out.println(Arrays.toString(output));
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};

        // Check for first occurrence
        ans[0] = search(arr, target, true);

        // Check for last occurrence
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }

        return ans;
    }

    // This function just returns the index value of target
    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}