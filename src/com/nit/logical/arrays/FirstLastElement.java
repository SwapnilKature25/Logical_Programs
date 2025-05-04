package com.nit.logical.arrays;
// Given an array of integers, return true if 15 appears as either the first or last element in the array. The array will be length 1 or more.
public class FirstLastElement {

	public static void main(String[] args) {
		int []x= {45,43,24,56,15};
		boolean b=firstLast(x);
		System.out.println("15 is available : "+b);
	}
	
	public static boolean firstLast(int arr[])
	{
		if(arr[0]==15 || arr[arr.length-1]==15)
				return true;
		else 
				return false;
	}

}
 