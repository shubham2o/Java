package com.linear_search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        // Return max from the 2DArray.
        int max = max(arr);
        System.out.println(max);

        // Return index of the number from the given array.
        int[] ans = search(arr, max);    // format of return value {row, col}.
        System.out.println(Arrays.toString(ans));
    }

    // Return max from the 2DArray.
    static int max(int[][] arr) {
        // Enhanced for-loop
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int col : row) {
                if (max < col) {
                    max = col;
                }
            }
        }
        return max;

/*      for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (max < arr[row][col]) {
                    max = arr[row][col];
                }
            }
        }
        return max; */
    }

    // Return index of the number from the given array.
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}