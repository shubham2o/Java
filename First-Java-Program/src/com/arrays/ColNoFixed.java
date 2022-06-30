package com.arrays;

import java.util.Arrays;
public class ColNoFixed {
    public static void main(String[] args) {
//      INPUT
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };

//      OUTPUT - First Approach
        System.out.println("-> A. First Approach");
        for (int row = 0; row < arr.length; row++) {
           for (int col = 0; col < arr[row].length; col++) {
                 System.out.print(arr[row][col] + " ");
           }
           System.out.println();
        }

//      OUTPUT - Second Approach (Arrays.toString())
        System.out.println("-> B. Second Approach");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

//      OUTPUT - Third Approach (Enhanced for-loop)
        System.out.println("-> C. Third Approach");
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}