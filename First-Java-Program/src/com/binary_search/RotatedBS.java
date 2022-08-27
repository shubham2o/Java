package com.binary_search;

import java.util.Arrays;

public class RotatedBS {
    /* Search in Rotated Sorted Array
    There is an integer array nums sorted in ascending order (with distinct values).

    Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
    such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
    For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

    Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums,
    or -1 if it is not in nums.

    Example 1:
    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4

    Example 2:
    Input: nums = [4,5,6,7,0,1,2], target = 3
    Output: -1

    Example 3:
    Input: nums = [1], target = 0
    Output: -1 */

    public static void main(String[] args) {
        // Example 1:
        int target1 = 0;
        System.out.print("• Target = " + target1);
        int[] arr1 = {4, 5, 6, 7, 0, 1, 2};
        System.out.print(", "+ Arrays.toString(arr1));
        int ans1 = search(arr1, target1);
        System.out.println(", Output = " + ans1);

        // Example 2:
        int target2 = 3;
        System.out.print("• Target = " + target2);
        int[] arr2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.print(", "+ Arrays.toString(arr2));
        int ans2 = search(arr2, target2);
        System.out.println(", Output = " + ans2);

        // Example 3:
        int target3 = 9;
        System.out.print("• Target = " + target3);
        int[] arr3 = {1};
        System.out.print(", "+ Arrays.toString(arr3));
        int ans3 = search(arr3, target3);
        System.out.println(", Output = " + ans3);

        // Example 4:
        int target4 = 2;
        System.out.print("• Target = " + target4);
        int[] arr4 = {10, 20, 30, 0, 1, 2};
        System.out.print(", "+ Arrays.toString(arr4));
        int ans4 = search(arr4, target4);
        System.out.println(", Output = " + ans4);

        // Example 5:
        int target5 = 30;
        System.out.print("• Target = " + target5);
        int[] arr5 = {30, 40, 0, 1, 2, 3};
        System.out.print(", "+ Arrays.toString(arr5));
        int ans5 = search(arr5, target5);
        System.out.println(", Output = " + ans5);

        // Example 6:
        int target6 = 4;
        System.out.print("• Target = " + target6);
        int[] arr6 = {10, 20, 30, 60, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.print(", "+ Arrays.toString(arr6));
        int ans6 = search(arr6, target6);
        System.out.println(", Output = " + ans6);

        // Example 7:
        int target7 = 20;
        System.out.print("• Target = " + target7);
        int[] arr7 = {10, 15, 20, 40, 50, 60, 0, 1, 2};
        System.out.print(", "+ Arrays.toString(arr7));
        int ans7 = search(arr7, target7);
        System.out.println(", Output = " + ans7);
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // Just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        // If pivot is found, you have found two ascending sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    // This will not work in duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case I:
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // Case II:
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // Case III:
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            // Case IV:
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
