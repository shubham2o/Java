package com.linear_search;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Search for 3 in the range of index [1, 4].
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(Arrays.toString(arr));

        int target = in.nextInt();
        int start = in.nextInt();
        int end = in.nextInt();
        int search =  searchInRange(arr, target, start, end);
        System.out.println(search);
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}