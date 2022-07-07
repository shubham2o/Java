package com.binary_search;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] ascArr = {-18, -12, -4, 0, 2, 3, 4 ,15, 16, 18, 22, 45, 89};
        System.out.println(Arrays.toString(ascArr));

        int target = in.nextInt();
        int ans = orderAgnosticBS(ascArr, target);
        System.out.println(ans);

        int[] dscArr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        System.out.println(Arrays.toString(dscArr));

        int target2 = in.nextInt();
        int ans2 = orderAgnosticBS(dscArr, target2);
        System.out.println(ans2);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
/*      if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }  */

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