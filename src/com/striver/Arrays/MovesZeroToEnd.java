package com.striver.Arrays;

import java.util.Arrays;
import java.util.Vector;

// Moves all zeros to the end of the array
public class MovesZeroToEnd {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
		int n = arr.length;
//		Brute force approach  TC : O(2N)  SC : O(N)
		// Step 1: Store all non-zero elements in temp
		Vector<Integer> temp = new Vector<>();
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				temp.add(arr[i]);
			}
		}
		System.out.println("Non-zero elements: " + temp);

		// Step 2: Copy back the non-zero elements
		for (int i = 0; i < temp.size(); i++) {
			arr[i] = temp.get(i);
		}

		// Step 3: Fill remaining array with zeros
		for (int i = temp.size(); i < n; i++) {
			arr[i] = 0;
		}

		// Final result
		System.out.println("Result after moving zeros: " + Arrays.toString(arr));

	}

}
/*
Non-zero elements: [1, 2, 3, 2, 4, 5, 1]
Result after moving zeros: [1, 2, 3, 2, 4, 5, 1, 0, 0, 0]


*/
