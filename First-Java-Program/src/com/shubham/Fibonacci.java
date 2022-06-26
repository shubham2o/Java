package com.shubham;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // 1st Approach - using while loop
        System.out.println("A. 1st Approach using while loop");
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

        // 2nd Approach - using while loop
        System.out.println("B. 2nd Approach using while loop");
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

        // 3rd Approach - using for loop
        System.out.println("C. 3rd Approach using for loop");
        int x = 0;
        int y = 1;

        for (int counting = 2; counting <= n; counting++) {
            int temp1 = y;
            y = x +  y;
            x = temp1;
        }
        System.out.println(y);

        // 4th Approach - using for loop
        System.out.println("D. 4th Approach using for loop");
        int r = 1;
        int s = 1;

        for (int nth = 3; nth <= n; nth++) {
            int addition = r + s;
            r = s;
            s = addition;
        }
        System.out.println(s);
    }
}
