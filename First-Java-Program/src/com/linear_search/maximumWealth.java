package com.linear_search;

import java.util.Arrays;

public class maximumWealth {
    public static void main(String[] args) {
        /*
        You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in
        the jth bank. Return the wealth that the richest customer has.
        A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the
        customer that has the maximum wealth.

        EXAMPLE 1:
        Input: accounts = [[1, 2, 3], [3, 2, 1]]
        Output: 6
        Explanation:
        1st customer has wealth = 1 + 2 + 3 = 6.
        2nd customer has wealth = 3 + 2 + 1 = 6.
        Both the customers are considered the richest with a wealth of 6 each, so return 6.

        EXAMPLE 2:
        Input: accounts = [[1, 5], [7, 3], [3, 5]]
        Output: 10
        Explanation:
        1st customer has wealth = 6
        2nd customer has wealth = 10
        3rd customer has wealth = 8
        The 2nd customer is the richest with a wealth of 10.
         */

        int[][] example1 = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(maximumWealth(example1));

        int[][] example2 = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println(maximumWealth(example2));
    }

    static int maximumWealth(int[][] accounts) {
//      person = row
//      acc = column
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
//          when you start a new col, take a new sum for that row.
            int sum = 0;
            for (int acc = 0; acc < accounts[person].length; acc++) {
                sum += accounts[person][acc];
            }

//          now we have sum of accounts of person
//          check with overall ans
            if (ans <= sum) {
                ans = sum;
                System.out.println(Arrays.toString(accounts[person]));
            }
        }

        return ans;
    }
}
