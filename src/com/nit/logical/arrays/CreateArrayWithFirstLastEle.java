package com.nit.logical.arrays;

import java.util.Arrays;

//Given an array of integers, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
public class CreateArrayWithFirstLastEle {

	public static void main(String[] args) {
		int arr[]= {3,5,2,5};
		int[] containFirstLast = containFirstLast(arr);
		System.out.println(Arrays.toString(containFirstLast));
	}
	
	public static int[] containFirstLast(int arr[])
	{
//		int arr2[]= {arr[0], arr[arr.length-1]};
		int arr2[]= new int[2];
		if(arr.length > 1)
		{
			arr2[0]=arr[0];
			arr2[1]=arr[arr.length-1];
		}
		else {
			arr2[0]= arr[0];
			arr2[1]=arr[0];
		}
		return arr2;
	}

}
