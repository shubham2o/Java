package com.binary_search;

import java.util.Arrays;

public class RowColMatrix {
    // Search in 2D Arrays or matrix
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        // Example 1:
        int target1 = 37;
        System.out.println(Arrays.toString(search(arr, target1)));

        // Example 2:
        int target2 = 33;
        System.out.println(Arrays.toString(search(arr, target2)));

        // Example 3:
        int target3 = 100;
        System.out.println(Arrays.toString(search(arr, target3)));

        // Example 4:
        int target4 = 30;
        System.out.println(Arrays.toString(search(arr, target4)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return new int[]{-1, -1};
    }
}
