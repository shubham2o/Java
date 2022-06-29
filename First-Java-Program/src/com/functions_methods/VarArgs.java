package com.functions_methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 56, 87, 23, 45, 65);
        multiple(2, 3, "Shubham", "Rahul", "Aman");
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println();
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}


