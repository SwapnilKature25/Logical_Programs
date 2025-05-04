package com.nit.logical.arrays;
// //Given an array of integers, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, return 0 if the array is having length 0.
public class SumOfFirst2Elements {

	public static void main(String[] args) {
		int arr[]= {4,2,5};
		int sumFirstTwo = sumFirstTwo(arr);
		System.out.println("Sum of First Two : "+sumFirstTwo);
	}

	public static int sumFirstTwo(int arr[])
	{
		int sum=0;
		if(arr.length == 1)
			return arr[0];
		if(arr.length == 0)
		{
			return 0;
		}
		else {
			return arr[0]+arr[1];			
		}
		
	}
}
