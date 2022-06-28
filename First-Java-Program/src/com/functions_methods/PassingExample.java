package com.functions_methods;

public class PassingExample {
    public static void main(String[] args) {
        String uncle = "Ram";
        greet(uncle);
    }

    static void greet(String name) {
        System.out.println(name);
    }
}
