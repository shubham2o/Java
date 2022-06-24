package com.shubham;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        System.out.print("1. What is your roll number - ");
        int rollNo = input.nextInt();
        System.out.println("Your roll number is " + rollNo);
        */

        int a = 10;
        /*
        10 above is basically called a literal (So, in primitive data type literals are syntactical representation of
        like boolean, character, numeric, etc.)
        a above is basically called the identifier (the reference variable, name of the variables, class, methods,
        functions, etc.)
        */

        /*
        How do we write in the form of millions (let say we have to write 230 million commas separated)
        int b = 230,000,000; (This is wrong syntactically, commas are not allowed and will throw an error)
        We can solve this issue with the help of underscore(_).
         */
        int b = 234_000_000;
        // System.out.println("2. " + b);

        /*
        System.out.print("3. What is your full name - ");
        String name = input.nextLine();
        System.out.println("Your full name is " + name);
        */

        /*
        System.out.print("4. What is your percentage - ");
        // float percentage = input.nextInt();
        float percentage = input.nextFloat();
        System.out.println("Your percentage is " + percentage);
        */

        /*
        System.out.println("5. Enter two numbers -");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
        */
    }
}
