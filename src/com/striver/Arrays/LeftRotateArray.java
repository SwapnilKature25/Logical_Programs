package com.striver.Arrays;

import java.util.Arrays;

// Left rotate an array by one place
// TC : O(N)
// SC : O(1)
public class LeftRotateArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println("Array before rotating : "+Arrays.toString(arr));
		int n=arr.length;
		int temp=arr[0];
		for(int i=1; i<n; i++)
		{
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
		
		System.out.println("Array after rotating : "+Arrays.toString(arr));
	}
	// Array before rotating : [1, 2, 3, 4, 5]
	//	Array after rotating : [2, 3, 4, 5, 1]
}
