package com.functions_methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2, sum;
        System.out.print("Enter a number: ");
        num1 = in.nextInt();
        System.out.print("Enter a second number: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }
}
