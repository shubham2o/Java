package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ARRAY OF PRIMITIVES
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
        // System.out.println(arr[3]);

        // input using for-loop
        for (int i = 0; i < arr.length; i++) {
            // arr[i] = in.nextInt();
        }
                     // OR
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
        }

        // Enhanced for-loop or for-each
        for (int j : arr) {     // for every element in array. print the element.
            // System.out.print(j + " ");   // Here num represents element of the array.
        }

        // System.out.println(arr[5]);   // index out of bound error.
        // System.out.println(Arrays.toString(arr));

        // ARRAY OF OBJECTS
        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // Modify
        str[1] = "Curry";   // It will change the original object at that position.
        System.out.println(Arrays.toString(str));
    }
}