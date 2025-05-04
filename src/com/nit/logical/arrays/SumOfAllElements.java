package com.nit.logical.arrays;
//Given an array of integers length 3, return the sum of all the elements.

public class SumOfAllElements {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println("Sum : "+sumAll(arr));
	}
	
	public static int sumAll(int arr[])
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		return sum;
	}

}
