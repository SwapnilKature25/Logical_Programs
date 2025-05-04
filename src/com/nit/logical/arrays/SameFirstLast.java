package com.nit.logical.arrays;
//Given an array of integers, return true if the array length is 1 or more,and the first element and the last elements both are equal.
public class SameFirstLast {

	public static void main(String[] args) {
        int []x = {12,12,90,89,56,12};
        boolean b = sameFirstLastEle(x);
        System.out.println("Is first and last element is same : "+b);
	}

	public static boolean sameFirstLastEle(int arr[])
	{
		if(arr.length > 0 && arr[0]==arr[arr.length-1])
			return true;
			
		return false;
	}
}
