package com.shubham;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Count the number of times/frequencies a number is repeated.
        System.out.println("A. Write a figure.");
        int num = in.nextInt();
        System.out.println("B. What number is repeated?");
        int repNum = in.nextInt();

        int count = 0;
        while (num > 0) {
            int remainder = num % 10;
            if (remainder == repNum) {
                count++;
            }
            num /= 10;  // num = num / 10;
        }
        System.out.println("=> How many times?");
        System.out.println("ANSWER - " + repNum + " is repeated " + count + " times.");
    }
}