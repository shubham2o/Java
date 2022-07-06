package com.linear_search;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Shubham";
        char target = 'u';
        System.out.println(search(name, target));

        System.out.println(search2(name, target));

        System.out.println(name.toCharArray());

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}