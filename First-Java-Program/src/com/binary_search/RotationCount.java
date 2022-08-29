package com.binary_search;

public class RotationCount {
    /* Find the Rotation Count in Rotated Sorted array
    Consider an array of distinct numbers sorted in increasing order. The array has been rotated (clockwise) k number of
    times. Given such an array, find the value of k.

    Example 1:
    Input: arr[] = {15, 18, 2, 3, 6, 12}
    Output: 2
    Explanation: Initial array must be {2, 3, 6, 12, 15, 18}. We get the given array after rotating the initial array
    twice.
    */
    public static void main(String[] args) {
        // Example 1:
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(countRotations(arr));

        // Example 2:
        int[] arr2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotations(arr2));

        // Example 3:
        int[] arr3 = {90, 1, 2, 3, 4, 80};
        System.out.println(countRotations(arr3));

        // Example 4:
        int[] arr4 = {1, 2, 3, 4, 5, 10, 0};
        System.out.println(countRotations(arr4));

        // Example 5:
        int[] arr5 = {5, 10, 20, 30, 100};
        System.out.println(countRotations(arr5));
    }

    static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    // Use this for non-duplicates
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    // Use this when arr contains duplicates
    static int findPivotDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}