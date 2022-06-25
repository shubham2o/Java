package com.shubham;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // QUESTION => Check whether the first letter of a word is in uppercase or lowercase.
        // ANSWER =>
        char ch = in.next().trim().charAt(0);
        System.out.print("A. ");

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
    }
}
