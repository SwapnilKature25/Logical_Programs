package com.striver.Arrays;

//Second Smallest element in an array without sorting
public class SecondSmallestElement {

	public static void main(String[] args) {
		int arr[]= {1,2,4,7,7,5};
		int n=arr.length;
		int smallest=arr[0];
		int sSmallest=Integer.MAX_VALUE;
		
		for(int i=1; i<n; i++) {
			if(arr[i] < smallest) {  // 2<1 4<2 7<4 7<7 5<7
				sSmallest = smallest; // 7
				smallest = arr[i]; // 5
			}
			else if(arr[i] != smallest && arr[i] < sSmallest) {
				sSmallest=arr[i];
			} 
		}	
		System.out.println("The second smallest element : "+sSmallest+" and smallest : "+smallest);	
	}
}
