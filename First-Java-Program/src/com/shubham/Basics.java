package com.shubham;

public class Basics {
    public static void main(String[] args) {
        // if statement
        int a = 10;
        if (a == 10) {
            System.out.println("A. Hello World");
        }

        // while loop
        System.out.println("B. while loop (Count till 5)");
        int count = 1;
        while (count != 6) {
            System.out.println(count);
            count++;
        }

        // for loop
        System.out.println("C. for loop (Count till 6)");
        for (int counting = 1; counting != 6; counting++) {
            System.out.println(counting);
        }

        // When you don't know how many times the loop will run, then in such case use while loop. And on the other hand,
        // if you know how many times the loop will run, then in that case use the for loop.
    }
}