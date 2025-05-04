package com.nit.logical.arrays;

import java.util.Arrays;

//Given an integer array, return a new array with double the length where its last element is the same as the original array, and all the other elements are containing 0. The original array will be length 1 or more.
public class CreateArrayLastEleSame {

	public static void main(String[] args) {
		int arr[]= {3,5,2,5};
		 int []y = createArrayWithSameLast(arr);
	       System.out.println("Array is :"+Arrays.toString(y));
		
	}

	public static int[] createArrayWithSameLast(int arr[])
	{
		int len=arr.length;
		int arr2[]=new int[len*2];
		
		arr2[arr2.length-1]=arr[len-1];
		return arr2;
	}
}
