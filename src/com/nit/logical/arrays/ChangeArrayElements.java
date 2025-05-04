package com.nit.logical.arrays;

import java.util.Arrays;

class ChangeArray
{
	public static int[] changeArrayElements(int[] p)
	{
		p[0]=100;
		p[1]=200;
		
		return p;
	}
}

public class ChangeArrayElements {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		System.out.println("Array Elements before Change :"+Arrays.toString(arr));
		int[] changeArrayElements = ChangeArray.changeArrayElements(arr);
		System.out.println("Array Elements After Change :"+Arrays.toString(changeArrayElements));
		
		System.out.println("Original array will modified or not :"+Arrays.toString(arr));
	}
	
	
}
