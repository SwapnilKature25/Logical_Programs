package com.striver.Arrays;

import java.util.Arrays;
import java.util.Scanner;
/*
Print reverse array in Java using recursion for the given input array without using any extra space.Ignore the implicit stack used in recursion for computing the space complexity.
*/
public class ReverseArrayUsingRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements : ");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array : "+Arrays.toString(arr));
		
		reverseArray(arr,0,size-1);
		System.out.println("Reverse array : "+Arrays.toString(arr));
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void reverseArray(int arr[],int start, int end) {
		if(start>=end) {
			return;
		}
		// swap elements
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
		// recursive call
		reverseArray(arr, start+1, end-1);
	}
}

/*
Enter the size of array : 
5
Enter the array elements : 
2 1 4 5 2
Original array : [2, 1, 4, 5, 2]
Reverse array : [2, 5, 4, 1, 2]
2 5 4 1 2 

*/
