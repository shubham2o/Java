package com.functions_methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // String message = greet();
        // System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String naam = in.nextLine();
        String personalized = myGreet(naam);
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }
}
