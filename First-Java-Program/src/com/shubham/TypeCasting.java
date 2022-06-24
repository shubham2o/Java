package com.shubham;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        float num = input.nextFloat();
        int num = input.nextInt();
        System.out.println(num);
        */

        // TYPE CASTING
        int num = (int)(30.231133f);
        System.out.println("1. " + num);

        float percentage = (float)(30.231133);
        System.out.println("2. " + percentage);

        // AUTOMATIC TYPE PROMOTION IN EXPRESSIONS
        int a = 260;
        byte b = (byte)(a);     // (260-256=4)
        System.out.println("3. " + b);

        byte x = 40;
        byte y = 50;
        byte z = 100;
        int c = (x * y) / z;
        System.out.println("4. " + c);
        /*
        QUESTION => x * y (40 * 50) = 2000byte. But how it is able to store 2000 in a byte data-type if all the other
        bytes can store or the maximum value any byte can store is only 256?

        ANSWER => The result of the intermediate term x * y easily exceeds the range or limit of a byte operator/operand.
        Firstly, To handle this kind of problem java is automatically promoting each byte to integer when it is evaluating
        the expression (x * y). Whenever you are performing the byte evaluation it automatically converts it into the
        integer. Secondly, it is indirectly converting the byte into integer by writing int c = ... and int > byte.
        */

        int number = 'A';
        int number2 = 'a';
        System.out.println("5. A = " + number + ", a = " + number2);

        /*
        RULES FOR TYPE PROMOTION
        1. All the byte short and character values are promoted to integer.
        2. If any one of the operands (*,/,etc.) is long then the whole operation will be promoted to long.
        3. If any one of the operands (*,/,etc.) is float then the whole operation will be promoted to float.
        Example => (3 * 5.634567654f = 16.903704)
        4. If any one of the operands (*,/,etc.) is double then the whole operation will be promoted to double.
        Example => (3 * 5.6 = 16.7999999999999997)
        */

        // EXAMPLE
        byte bb = 42;
        char cc = 'a';
        short ss = 1024;
        int ii = 50000;
        float ff = 5.67f;
        double dd= 0.1234;

        double result = (ff * bb) + (ii / cc) - (dd * ss);
        System.out.println("6. " + (ff * bb) + "=>float   " + (ii / cc) + "=>integer   " + (dd * ss) + "=>double");
        // float + int - double = double, because it is the biggest/maximum among all of them. So, output will be of double data type.
        System.out.println("7. " + result);
    }
}
