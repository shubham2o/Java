package com.functions_methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("1." + a);
        System.out.println("2.. " + b);
        // System.out.println("3...  " + c);    // Cannot access variable c before declaration or initialization.
        System.out.println("");

        {
            // int a = 78;     // Cannot re-declare/re-initialize a variable.
            a = 78;            // Value overwritten from 10 to 78.
            System.out.println("1." + a);
            System.out.println("2.. " + b);     // Can access b variable here which is declared outside the block.

            int c = 99;
            System.out.println("3...  " + c);
            System.out.println("");
        }

        System.out.println("1." + a);       // Value will be overwritten from 10 to 78 here also.
        System.out.println("2.. " + b);     // Can access b variable here which is declared in the same block.

        // System.out.println(c);     // Cannot access/print c here because of block scope.
        int c = 30;                   // But can re-declare variable c here, outside the nested scope.
        System.out.println("3...  " + c);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}