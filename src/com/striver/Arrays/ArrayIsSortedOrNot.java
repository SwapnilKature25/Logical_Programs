package com.striver.Arrays;
// Check if the array is sorted.
public class ArrayIsSortedOrNot {

	public static void main(String[] args) {
		int arr[]= {1,2,1,4,3,5};
		boolean sortedOrNot = isSorted(arr);
		System.out.println("Array is sorted or not : "+sortedOrNot);
	}
	
	public static boolean isSorted(int[] arr) {
		for(int i=1; i<arr.length; i++)   // no need to check for 1st element
		{
			if(arr[i] >= arr[i-1])
			{
				
			}else {
				return false;
			}
		} 
		return true;
	}
}
