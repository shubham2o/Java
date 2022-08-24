package com.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(Arrays.toString(arr));

        int target = in.nextInt();
        int floorInd = floorInd(arr, target);
        System.out.println("Index: " + floorInd);

        int floorEl = floorEl(arr, target);
        System.out.println("Element: " + floorEl);
    }

    // return index of the greatest number smaller than or equal to the target.
    static int floorInd(int[] arr, int target) {
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

        // but what if the target is lower than the lowest number in the array.
        if (target < arr[0]) {
            return -1;
        }

        return end;
    }

    // return element of the greatest number smaller or equal to the target.
    static int floorEl(int[] arr, int target) {
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

        // but what if the target is lower than the lowest number in the array.
        if (target < arr[0]) {
            return -1;
        }

        return arr[end];
    }
}