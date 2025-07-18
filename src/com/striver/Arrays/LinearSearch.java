package com.striver.Arrays;

// Linear search
public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 5, 3, 4, 1 };
		int num=44;
		int numberIsPresentOrNot = numberIsPresentAtIndex(arr, num);
		System.out.println("number Is Present at index no. : "+numberIsPresentOrNot);
	}
	
	public static int numberIsPresentAtIndex(int arr[],int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				return i;
			}
		}
		return -1;
	}

}
