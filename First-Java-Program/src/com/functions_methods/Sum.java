package com.functions_methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();

        int ans2 = sum2();
        System.out.println(ans2);

        int ans3 = sum3(20, 30);
        System.out.println("C. " + ans3);
    }

    /* Pass the value of numbers when you are calling the method in main().
       This can be done with the help of arguments and parameters. */
    static int sum3(int a, int b) {
        int add = a + b;
        return add;
    }

    // Return the value
    static int sum2() {
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);

        System.out.println("B.");
        System.out.print("Enter a number: ");
        num1 = in.nextInt();
        System.out.print("Enter a second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;   /* return here means that in any function/method whenever the return statement is hit, it basically
                         ends the program there itself. In other words, any statement/code after the return statement
                         will not work or execute. */
    }

    // Basic
    static void sum() {
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);

        System.out.println("A.");
        System.out.print("Enter a number: ");
        num1 = in.nextInt();
        System.out.print("Enter a second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }
}