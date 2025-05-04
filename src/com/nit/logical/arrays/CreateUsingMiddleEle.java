package com.nit.logical.arrays;

import java.util.Arrays;

//Given 2 integer arrays, a and b, each length is 3, return a new array length 2 containing their middle elements.
public class CreateUsingMiddleEle {

	public static void main(String[] args) {
		int arr1[]= {4,12,5};
		int arr2[]= {15,6,3};
		int[] createNewArray = createNewArrayUsingMiddleEle(arr1, arr2);
		System.out.println("Middle elements : "+Arrays.toString(createNewArray));
	}
	
	public static int[] createNewArrayUsingMiddleEle(int arr1[],int arr2[])
	{
		int i = arr1[arr1.length/2];
		int j = arr2[arr2.length/2];
		int []arr3= {i,j};
//		or  int[] myArray = new int[]{a[1], b[1]};  
		return arr3;
		
	}

}
