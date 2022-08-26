package com.binary_search;

import java.util.Arrays;

public class FindInMountainArray {
    /* You may recall that an array A is a mountain array if and only if:
          • A.length >= 3
          • There exists some i with 0 < i < A.length - 1 such that:
                  -- A[0] < A[1] < ... A[i-1] < A[i]
                  -- A[i] > A[i+1] > ... > A[A.length - 1]
       Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such
       an index doesn't exist, return -1.
       You can't access the mountain array directly. You may only access the array using a MountainArray interface.

       Example 1:
       Input: array = [1, 2, 3, 4, 5, 3, 1], target = 3
       Output: 2
       Explanation: 3 exists in the array, at index = 2 and index = 5. Return the minimum index, which is 2.

       Example 2:
       Input: array = [0, 1, 2, 4, 2, 1], target = 3
       Output: -1
       Explanation: 3 does not exist in the array, so return -1. */

    public static void main(String[] args) {
        // Example 1:
        int target1 = 3;
        System.out.print("• Target = " + target1);
        int[] arr1 = {1, 2, 3, 4, 5, 3, 1};
        System.out.print(", " + Arrays.toString(arr1));
        int ans1 = search(arr1, target1);
        System.out.println(", Index = " + ans1);

        // Example 2:
        int target2 = 3;
        System.out.print("• Target = " + target2);
        int[] arr2 = {0, 1, 2, 4, 2, 1};
        System.out.print(", " + Arrays.toString(arr2));
        int ans2 = search(arr2, target2);
        System.out.println(", Index = " + ans2);

        // Example 3:
        int target3 = 20;
        System.out.print("• Target = " + target3);
        int[] arr3 = {20, 30, 40, 30, 3, 2, 0};
        System.out.print(", " + Arrays.toString(arr3));
        int ans3 = search(arr3, target3);
        System.out.println(", Index = " + ans3);

        // Example 4:
        int target4 = 2;
        System.out.print("• Target = " + target4);
        int[] arr4 = {20, 30, 40, 30, 3, 2, 0};
        System.out.print(", " + Arrays.toString(arr4));
        int ans4 = search(arr4, target4);
        System.out.println(", Index = " + ans4);
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        // Try to search in second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}