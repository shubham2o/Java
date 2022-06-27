package com.shubham;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("A. Fruits");
        String fruit = in.next();
        switch(fruit) {
            case "Mango" :
                System.out.println("King of fruits");
                break;
            case "Apple" :
                System.out.println("A sweet red fruit");
                break;
            case "Orange" :
                System.out.println("A round orange fruit");
            case "Grapes" :
                System.out.println("A small fruit");
            default :
                System.out.println("Please enter a valid fruit");
        }

        // Weekends and Weekdays
        System.out.println("B. Weekends and Weekdays");
        /*
        int day = in.nextInt();
        switch(day) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Weekday");
                break;
            case 6 :
            case 7 :
                System.out.println("Weekend");
        }
        */

        // Above switch statement can also be written like:
        int day = in.nextInt();
        System.out.println("New way to write switch statements");
        switch(day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}