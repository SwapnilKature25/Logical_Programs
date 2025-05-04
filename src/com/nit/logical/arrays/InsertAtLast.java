package com.nit.logical.arrays;

import java.util.Arrays;
// insert new element at last position
class InsertLast
{
	public static int[] insertLast(int arr[],int newEle)
	{
		int newArray[]=new int[arr.length+1];
		for(int i=0; i<arr.length; i++)
		{
			newArray[i]=arr[i];
		}
		
		newArray[newArray.length-1]=newEle;   // adding at last position
		
		return newArray;
	}
}

public class InsertAtLast {

	public static void main(String[] args) {
		int arr[]= {20,10,40,30};
		System.out.println("Original array : "+Arrays.toString(arr));
		
		int[] insertLast=InsertLast.insertLast(arr, 3);
		System.out.println("New array : "+Arrays.toString(insertLast));
	}

}
