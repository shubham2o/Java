package com.binary_search;

import java.util.Arrays;

public class FirstLastOccurrence {
    /* Given a sorted array arr containing n elements with possibly duplicate elements, the task is to find indexes of
    first and last occurrences of an element x in the given array.

    EXAMPLE 1:
    Input:
    n = 9, x = 5
    arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
    Output: 2 5
    Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5.

    EXAMPLE 2:
    Input:
    n = 9, x = 7
    arr[] = {1, 3, 5, 5, 5, 5, 7, 123, 125}
    Output: 6 6 */

    public static void main(String[] args) {
//      EXAMPLE 1:
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int n = 9;
        int x = 5;

        int[] example1 = find(arr, n, x);       // Using find()
        System.out.println(Arrays.toString(example1));

        int[] ex1 = findHelper(arr, n, x, true);    // Using findHelper()
        System.out.print(Arrays.toString(ex1));
        int[] ex_1 = findHelper(arr, n, x, false);
        System.out.println(Arrays.toString(ex_1));

//      EXAMPLE 2:
        int[] arr2 = {1, 3, 5, 5, 5, 5, 7, 123, 125};
        int n2 = 9;
        int x2 = 7;

        int[] example2 = find(arr2, n2, x2);       // Using find()
        System.out.println(Arrays.toString(example2));

        int[] ex2 = findHelper(arr2, n2, x2, true);    // Using findHelper()
        System.out.print(Arrays.toString(ex2));
        int[] ex_2 = findHelper(arr2, n2, x2, false);
        System.out.println(Arrays.toString(ex_2));
    }

    static int[] find(int[] arr, int n, int x) {
//      Finding First
        int lowest = 0;
        int highest = n - 1;
        int first = -1;
        int last = -1;

        while (lowest <= highest) {
            int mid = lowest + (highest - lowest) / 2;

            if (arr[mid] > x) {
                highest = mid - 1;
            } else if (arr[mid] < x) {
                lowest = mid + 1;
            } else {
                first = mid;
                highest = mid - 1;
            }
        }

//      Finding Last
        lowest = 0;
        highest = n - 1;

        while (lowest <= highest) {
            int mid = lowest + (highest - lowest) / 2;

            if (arr[mid] > x) {
                highest = mid - 1;
            } else if (arr[mid] < x) {
                lowest = mid + 1;
            } else {
                last = mid;
                lowest = mid + 1;
            }
        }

        return new int[]{first, last};
    }

//  Using findHelper function for better time complexity and code re-usability.
    static int[] findHelper(int[] arr, int n, int x, boolean isFirst) {
        int lowest = 0;
        int highest = n - 1;
        int ans = -1;

        while (lowest <= highest) {
            int mid = lowest + (highest - lowest) / 2;

            if (arr[mid] > x) {
                highest = mid - 1;
            } else if (arr[mid] < x) {
                lowest = mid + 1;
            } else {
                if (isFirst) {
                    highest = mid - 1;
                }
                else {
                    lowest = mid + 1;
                }
                ans = mid;
            }
        }

        return new int[]{ans};
    }
}