package com.shubham;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // QUESTION => Print numbers from 1 to n using FOR loop
        System.out.println("A. for loop");
        int n = in.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println(num);
        }

        // QUESTION => Print numbers from 1 to n using WHILE loop
        System.out.println("B. while loop");
        int num1 = 1;
        while (num1 <= n) {
            System.out.println(num1);
            num1++;
        }

        // QUESTION => Print numbers from 1 to n using DO-WHILE loop
        System.out.println("C. do-while loop");
        int num2 = 1;
        do {
            System.out.println(num2);
            num2++;
        } while (num2 <= n);

        /* QUESTION => What is the difference between while and do-while loop and what to use when?
        ANSWER => In the do-while loop, the program (loop) is going to execute at-least once no matter whether the
        condition is true or false, but it will execute at-least once.
        EXAMPLE :
        */
        int num3 = 1;
        do {
            System.out.println("D. do-while will execute at-least once if false also.");
        } while (num3 != 1);
    }
}