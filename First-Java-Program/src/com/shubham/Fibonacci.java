package com.shubham;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // 1st Approach
        System.out.println("A. 1st Approach");
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);

        // 2nd Approach
        System.out.println("B. 2nd Approach");
        int first = 1;
        int second = 1;
        int counter = 3;

        while (counter <= n) {
            int add = first + second;
            first = second;
            second = add;
            counter++;
        }
        System.out.println(second);
    }
}
