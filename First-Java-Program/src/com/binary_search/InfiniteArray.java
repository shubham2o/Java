//package com.binary_search;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class InfiniteArray {
//    /* Find position/index of an element in a sorted array of infinite numbers
//    Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
//    Since array is sorted, the first thing clicks into the mind is binary search, but the problem here is that we don't
//    know the size of array.
//    If the array is infinite, that means we don't have proper bounds to apply binary search. So in order to find position
//    of key, first we find bounds and then apply binary search algorithm. */
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println("Target : ");
//        int target = in.nextInt();
//
//        System.out.println("Output : ");
//        int output = ans(arr, target);
//        System.out.println(output);
//    }
//
//    static int ans(int[] arr, int target) {
//        // first find the range
//        // first start with a box of size 2
//        int start = 0;
//        int end = 1;
//
//        while (target > arr[end]) {
//            int temp = end + 1;     // this is my new start
//            // double the box value
//            // end = previous end + sizeOfBox * 2
//            end = end + (end - start + 1) * 2;
//            start = temp;
//        }
//
//        return search(arr, target, start, end);
//    }
//
//    static int search(int[] arr, int target, int start, int end) {
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//
//        return -1;
//    }
//}



// Java program to demonstrate working of
// an algorithm that finds an element in an
// array of infinite size

package com.binary_search;

import java.util.Scanner;

public class InfiniteArray
{
    // Simple binary search algorithm
    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid-1, x);
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }

    // Method takes an infinite size array and a key to be
    // searched and returns its position if found else -1.
    // We don't know size of arr[] and we can assume size to be
    // infinite in this function.
    // NOTE THAT THIS FUNCTION ASSUMES arr[] TO BE OF INFINITE SIZE
    // THEREFORE, THERE IS NO INDEX OUT OF BOUND CHECKING
    static int findPos(int arr[],int key)
    {
        int l = 0, h = 1;
        int val = arr[0];

        // Find h to do binary search
        while (val < key)
        {
            l = h;     // store previous high
            //check that 2*h doesn't exceeds array
            //length to prevent ArrayOutOfBoundException
            if(2*h < arr.length-1)
                h = 2*h;
            else
                h = arr.length-1;

            val = arr[h]; // update new val
        }

        // at this point we have updated low
        // and high indices, thus use binary
        // search between them
        return binarySearch(arr, l, h, key);
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int ans = findPos(arr,target);

        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }
}