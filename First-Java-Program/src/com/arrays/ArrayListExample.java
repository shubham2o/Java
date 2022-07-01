package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//      SYNTAX
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(234);
        list.add(654);
        list.add(43);
        list.add(654);
        list.add(8765);

//      System.out.println("A. " + list);
//      System.out.println("B. " + list.contains(43));

//      list.set(0, 99);
//      System.out.println("C. " + list);

//      list.remove(5);
//      System.out.println("D. " + list);

//      INPUT
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);

//      Get item at any index
//      for (int i = 0; i < 5; i++) {
//          System.out.println(list.get(i));    // pass index here, list[index] syntax will not work here.
//      }
    }
}
