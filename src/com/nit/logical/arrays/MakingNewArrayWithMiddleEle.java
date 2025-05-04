package com.nit.logical.arrays;

import java.util.Arrays;

//Given an array of integers of odd length, return a new array length 3 containing the elements from the middle of the array.One element should be before middle and another one should be after middle. The original array length will be at least 3.
public class MakingNewArrayWithMiddleEle {

	public static void main(String[] args) {
		int arr[]= {3,5,2,8,5};
	    int []newArray =  middleThree(arr);
	    System.out.println("New Array Elements are :"+Arrays.toString(newArray));
	}
	
	public static int[] middleThree(int arr[])
	{
		int arr2[]=new int[3];
		
		if(arr.length >= 3)
		{
			arr2[0]=arr[arr.length/2-1];
			arr2[1]=arr[arr.length/2];
			arr2[2]=arr[arr.length/2+1];
		}
		return arr2;
	}

}
