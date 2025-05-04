package com.nit.logical.arrays;

import java.util.Arrays;

class MergeArray
{
	public static int[] mergingTwoArray(int arr1[],int arr2[])
	{
		int newArr[] = new int[arr1.length+arr2.length];
		int pos=0;
		// using for loop
//		for(int i=0; i<arr1.length; i++)
//		{
//			newArr[i]=arr1[i];
//			pos++;
//		}
//		for(int i=0; i<arr2.length; i++)
//		{
//			newArr[pos+i]=arr2[i];
//		}
//		
		// using foreach loop
		for (int i : arr1) {
			newArr[pos]=i;
			pos++;
		}
		for (int i : arr2) {
			newArr[pos]=i;
			pos++;
		}
		
		
		System.out.println(newArr.length);
		
		return newArr;
		
	}
}

public class MergeTwoArray {

	public static void main(String[] args) {
		int []arr1= {10,20,30,40};
		int []arr2= {50,60,70,80};
		
		int[] mergingTwoArray = MergeArray.mergingTwoArray(arr1, arr2);
		System.out.println(Arrays.toString(mergingTwoArray));
	}

}
