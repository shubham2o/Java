package com.linear_search;

import java.util.Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        // Given an array nums of integers, how many of them contain an even number of digit.
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(Arrays.toString(nums));

        int times = findNumbers(nums);
        System.out.println(times);
    }

    static int findNumbers(int[] nums) {
         int count = 0;
         for (int num : nums) {
             if (even(num)) {
                 count++;
             }
         }
         return count;
    }

    // function to check whether a number contains even digits or not.
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;

/*      if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false; */
    }

    // count number of digits in a number
    static int digits(int num) {
        // if the number is negative then convert it to the positive.
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;   // num /= 10
        }
        return count;
    }
}