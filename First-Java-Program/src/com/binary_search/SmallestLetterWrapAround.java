package com.binary_search;

import java.util.Arrays;

public class SmallestLetterWrapAround {
     /* Find The Smallest Letter Greater Than Target
    Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest
    character in the array that is larger than target.
    NOTE: The letters wrap around.
    • For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.

    EXAMPLE 1:
    Input: letters = ["c", "f", "j"], target = "a"
    Output: "c"

    EXAMPLE 2:
    Input: letters = ["c", "f", "j"], target = "c"
    Output: "f"

    EXAMPLE 3:
    Input: letters = ["c", "f", "j"], target = "d"
    Output: "f"

    EXAMPLE 4:
    Input: letters = ["c", "f", "j"], target = "g"
    Output: "j"

    EXAMPLE 5:
    Input: letters = ["c", "f", "j"], target = "j"
    Output: "c" */

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        System.out.println(Arrays.toString(letters));

//      Example 1
        char output = nextGreatestLetter(letters, 'a');
        System.out.println("Target a : " + output);

//      Example 2
        char output2 = nextGreatestLetter(letters, 'c');
        System.out.println("Target c : " + output2);

//      Example 3
        char output3 = nextGreatestLetter(letters, 'd');
        System.out.println("Target d : " + output3);

//      Example 4
        char output4 = nextGreatestLetter(letters, 'g');
        System.out.println("Target g : " + output4);

//      Example 5
        char output5 = nextGreatestLetter(letters, 'j');
        System.out.println("Target j : " + output5);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}