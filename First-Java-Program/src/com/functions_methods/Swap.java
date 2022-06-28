package com.functions_methods;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        /* In java, below-mentioned is the way to swap a number.
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b); */

        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Shubham Sharma";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "Rahul Rana";
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
