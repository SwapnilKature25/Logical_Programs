package com.nit.logical.arrays;

import java.util.Arrays;

//Given an array of integers length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
public class ChangeEleToLarger {

	public static void main(String[] args) {
		int arr[]= {84,2,5};
		int[] changedArray = changedArray(arr);
		System.out.println(Arrays.toString(changedArray));
	}
	
	public static int[] changedArray(int arr[])
	{
		int num=0;
//		if(arr[0] > arr[arr.length-1])
//		{
//			num=arr[0];
//		}
//		else 
//			num=arr[arr.length-1];
				// or
		num = Math.max(arr[0], arr[2]);
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=num;
		}
		
		return arr;
	}

}
