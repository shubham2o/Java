package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
              1 2 3
              4 5 6
              7 8 9
        */

//      SYNTAX
//      int[][] arr2D = new int[3][];
//             OR
        int[][] arr2D = {
                {1, 2, 3},    // Oth index
                {4, 5},       // 1st index
                {6, 7, 8, 9}  // 2nd index -> arr2D[2] = {6, 7, 8, 9}
        };
//      System.out.println(arr2D.length);    // It will give the number of rows, i.e, 3

//      INPUT
        int[][] arr = new int[3][3];

/*      for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
*/
//      OUTPUT - First Approach
        System.out.println("-> A. First Approach");
        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
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