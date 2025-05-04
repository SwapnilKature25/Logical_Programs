package com.nit.logical.arrays;

import java.util.Arrays;

public class InsertInExistingArray {

	public static void main(String[] args) {
		int []arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		System.out.println("Array Before insertion : "+ Arrays.toString(arr));
		
		int position= 2;
		int element = 29;
		
		// loop for shifting the elements
		for(int i=arr.length-1; i>position; i--)   // i=4  , 4>2  |  i=3 , 3>2
		{
			// here 3rd index value shifting to 4th index and 2nd index to 3rd 
			arr[i]=arr[i-1];  // arr[4]=arr[3]  ,  arr[3]=arr[2]     
		}
		
		arr[position]=element;  //arr[2]=29
		
		System.out.println("Array after insertion : "+ Arrays.toString(arr));
		
		
	}

}
