package com.binary_search;

import java.util.Arrays;

public class MountainArray {
    /* Peak Index in a Mountain Array
    Let's call an array a mountain if the following properties hold:
        • arr.length >= 3
        • There exists some i with 0 < i < arr.length - 1 such that:
                -- arr[0] < ... arr[i - 1] < arr[i]
                -- arr[i] > arr[i + 1] > ... arr[arr.length - 1]
    Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ...
    arr[i - 1] < arr[i] > arr[i + 1] > ... arr[arr.length - 1].

    Example 1:
    Input: arr = [0, 1, 0]
    Output: 1

    Example 2:
    Input: arr = [0, 2, 1, 0]
    Output: 1

    Example 3:
    Input: arr = [0, 10, 5, 2]
    Output: 1

    Example 4:
    Input: arr = [0, 1, 0]
    Output: 1 */

    public static void main(String[] args) {
        // Example 1:
        int[] arr1 = {0, 1, 0};
        System.out.print("• " + Arrays.toString(arr1));
        int ans1 = peakIndexMountainArray(arr1);
        System.out.println(" = " + ans1);

        // Example 2:
        int[] arr2 = {0, 2, 1, 0};
        System.out.print("• " + Arrays.toString(arr2));
        int ans2 = peakIndexMountainArray(arr2);
        System.out.println(" = " + ans2);

        // Example 3:
        int[] arr3 = {0, 10, 5, 2};
        System.out.print("• " + Arrays.toString(arr3));
        int ans3 = peakIndexMountainArray(arr3);
        System.out.println(" = " + ans3);

        // Example 4:
        int[] arr4 = {0, 1, 0};
        System.out.print("• " + Arrays.toString(arr4));
        int ans4 = peakIndexMountainArray(arr4);
        System.out.println(" = " + ans4);

        // Example 5:
        int[] arr5 = {10, 20, 30, 40, 60, 30, 10};
        System.out.print("• " + Arrays.toString(arr5));
        int ans5 = peakIndexMountainArray(arr5);
        System.out.println(" = " + ans5);

        // Example 6:
        int[] arr6 = {10, 20, 60, 40, 30, 20, 10};
        System.out.print("• " + Arrays.toString(arr6));
        int ans6 = peakIndexMountainArray(arr6);
        System.out.println(" = " + ans6);
    }

    static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                /* You are in the decreasing (descending) part of the array.
                   This may be the ans, but look at left-side.
                   This is why, end != mid - 1; */
                end = mid;
            } else {
                /* You are in the increasing (ascending) part of the array.
                   This may be the ans, but look at right-side. */
                start = mid + 1;
            }
        }

        /* In the end, start == end and pointing to the largest number because of the two checks above.
           start and end are always trying to find max element in the above two checks.
           Hence, when they are pointing to just one element, that is the max one because that is what the checks say. */
        return start;   // or return end as they both are equal.
    }
}
