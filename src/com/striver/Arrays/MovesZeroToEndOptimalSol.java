package com.striver.Arrays;

import java.util.Arrays;

// Optimal solution
public class MovesZeroToEndOptimalSol {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
		int n = arr.length;
		
		int j=-1;
		for(int i=0; i<n; i++)
		{
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
		
		for(int i=j+1; i<n; i++) {
			if(arr[i]!=0) {
				swap(arr,i, j);
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));  //[1, 2, 3, 2, 4, 5, 1, 0, 0, 0]

	}
	
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
}
