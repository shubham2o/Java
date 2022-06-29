package com.functions_methods;

public class Shadowing {
    static int x = 90;  // this will be shadowed at line 9.

    public static void main(String[] args) {
        System.out.println(x);  // 90
        int x = 40;
        System.out.println(x);  // 40
        fun();  // 90 because function fun is outside-of this current scope and there value of x is 90.
    }

    static void fun() {
        System.out.println(x);
    }
}
