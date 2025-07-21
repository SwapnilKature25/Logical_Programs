package com.nit.ArraysAndStrings;

public class LargestArray {

	public static void main(String[] args) {
		int arr[]= {10,3,5,7,2};
		int largest=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		
		System.out.println(largest);
	}

}
