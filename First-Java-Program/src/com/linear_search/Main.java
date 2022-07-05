package com.linear_search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = in.nextInt();

        System.out.println("A. Is " + target + " present in the array?");
        boolean ans = linearSearch(nums, target);
        System.out.println(ans);

        System.out.println("B. What is the index of " + target + "?");
        int ans2 = linearSearch2(nums, target);
        System.out.println(ans2);
    }

    // Search  the target and return true or false
    static boolean linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            // check for element at every index if it is equal to target
            if (element == target) {
                return true;
            }
        }

        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return false;
    }

    // Search in the array: return the index if item found
    // otherwise if item not found return -1.
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is equal to target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return -1;
    }
}