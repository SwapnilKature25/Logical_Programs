package com.nit.logical.arrays;

import java.util.Arrays;

//Given an array of integers, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
public class SwapFirstLastEle {

	public static void main(String[] args) {
		int arr[]= {3,5,2,5};
		 int []newArray =  swappedArray(arr);
		   
		    System.out.println("New Array Elements are :"+Arrays.toString(newArray));
	}
	
	public static int[] swappedArray(int arr[])
	{
		int temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		
		return arr;
	}

}
