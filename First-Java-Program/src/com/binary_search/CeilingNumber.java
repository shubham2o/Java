package com.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(Arrays.toString(arr));

        int target = in.nextInt();
        int ceilInd = ceilingInd(arr, target);
        System.out.println("Index: " + ceilInd);

        int ceilEl = ceilingEl(arr, target);
        System.out.println("Element: " + ceilEl);
    }

    // return index of the smallest number greater than or equal to the target.
    static int ceilingInd(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found (mid == target)
                return mid;
            }
        }

        // but what if the target is greater than the greatest number in the array.
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        return start;
    }

    // return element of the smallest number greater than or equal to the target.
    static int ceilingEl(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found (mid == target)
                return arr[mid];
            }
        }

        // but what if the target is greater than the greatest number in the array.

        if (target > arr[arr.length - 1]) {
            return -1;
        }

        return arr[start];
    }
}