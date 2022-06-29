package com.functions_methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("A. Is the number prime?");
        boolean ans = isPrime(n);
        System.out.println(ans);

        System.out.println("B. Is the number armstrong?");
        System.out.println(isArmstrong(n));

        // C. Print all the three digits armstrong numbers.
        System.out.println("C. Print all the three digits armstrong numbers.");
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    // B. Is the number armstrong?
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n / 10;
        }
        /* if (sum == original) {
            return true;
        }
        return false; */    // This can also be written as below:-
        return sum == original;
    }

    // A. Is the number prime?
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return (c * c > n);
    }
}
