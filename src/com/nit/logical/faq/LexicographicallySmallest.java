package com.nit.logical.faq;

import java.util.Arrays;

// Find the lexicographically smallest string
public class LexicographicallySmallest {
    public static String findSmallest(String[] arr) {
        Arrays.sort(arr);  // Lexicographical sort
        return arr[0];
    }

    public static void main(String[] args) {
        String[] arr = {"zebra", "apple", "banana", "cat"};
        System.out.println("Smallest string: " + findSmallest(arr));  // Smallest string: apple
    }
}
