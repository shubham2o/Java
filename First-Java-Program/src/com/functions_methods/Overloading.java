package com.functions_methods;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Shubham Sharma");
    }

    static void fun(int a) {
        System.out.println("Number is " + a);
    }

    static void fun(String name) {
        System.out.println("Name is " + name);
    }

    // When two or more functions have the same name but different arguments,
    // it can also be same data-type of arguments but different number of arguments,
    // like fun(int a) and fun(int name, int b).
}