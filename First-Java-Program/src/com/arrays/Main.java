package com.arrays;

public class Main {
    public static void main(String[] args) {
        // Question: Store a roll number.
        int a = 30;

        // Question: Store a person's name.
        String name = "Shubham Sharma";

        /* Question: Store 5 roll numbers.
        int b = 31;
        int c = 32;
        int d = 33;
        int e = 34;
        int f = 35;
        This is complicated and also not code-readable.
        So, here comes use of array/array-list in the picture. */

        /* SYNTAX
        data_type[] variable_name = new data_type[size]; */

        // Question: Store 5 roll numbers.
        int[] rnos = new int[5];
        // or directly
        int[] rnos2 = {31, 32, 33, 34, 35};

        // int array
        int[] ros;            // Declaration of an array. ros is getting declared in the STACK MEMORY.
        ros = new int[5];     // Initialization of an array. ros is being created in the HEAP MEMORY.
        System.out.println(ros[1]);   // Basically for an int array, by default it just going to have 0 elements.

        // String array
        String[] arr = new String[4];
        System.out.println(arr[0]);   // It will return null, which means that it does not have any data_type.

        // null
        String str = null;
        // int num = null;    // This will give error as we cannot assign null to any primitive data_types.
    }
}
