package com.arrays;

import java.util.Arrays;

public class MaxRange {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18, 30};
        System.out.println(Arrays.toString(arr));
        System.out.println(maxRange(arr, 0, 5));
    }

    static int maxRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}