package com.striver.Arrays;

import java.util.Arrays;

public class LeftRotateArrayByDPlaces2 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int D = 2;
//		Optimal Approach
        System.out.println("Original Array: " + Arrays.toString(arr));
        leftRotate(arr, D);
        System.out.println("Array after " + D + " left rotations: " + Arrays.toString(arr));
    }

    public static void leftRotate(int[] arr, int D) {
        int n = arr.length;
        D = D % n; // in case D > n

        // Step 1: Reverse first D elements
        reverse(arr, 0, D - 1);

        // Step 2: Reverse remaining elements
        reverse(arr, D, n - 1);

        // Step 3: Reverse the whole array
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    /*
Array: {2, 1, 7, 6, 5, 4, 3}

🔁 Internal swaps:
start = 0, end = 6
Swap arr[0] and arr[6] → 2 and 3
arr → {3, 1, 7, 6, 5, 4, 2}

start = 1, end = 5
Swap arr[1] and arr[5] → 1 and 4
arr → {3, 4, 7, 6, 5, 1, 2}

start = 2, end = 4
Swap arr[2] and arr[4] → 7 and 5
arr → {3, 4, 5, 6, 7, 1, 2}

start = 3, end = 3 → loop exits
    
    */
}
