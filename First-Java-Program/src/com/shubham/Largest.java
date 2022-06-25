package com.shubham;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // QUESTION => Find the largest among the three numbers.
        // ANSWER =>
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // 1st Approach
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("A. 1st Approach");
        System.out.println("Max number is " + max);

        // 2nd Approach
        int maximum = 0;
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        }
        if (c > maximum) {
            maximum = c;
        }
        System.out.println("B. 2nd Approach");
        System.out.println("Maximum number is " + maximum);

        // 3rd Approach
        int largest = Math.max(a, b);
        if (c > largest) {
            largest = c;
        }
        System.out.println("C. 3rd Approach");
        System.out.println("Largest number is " + largest);

        // 4th Approach
        int greatest = Math.max(c, Math.max(a, b));
        System.out.println("D. 4th Approach");
        System.out.println("Greatest number is " + greatest);
     }
}