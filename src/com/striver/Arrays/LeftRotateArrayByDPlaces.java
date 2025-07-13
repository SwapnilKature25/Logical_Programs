package com.striver.Arrays;

import java.util.Arrays;

//Left rotate an array by D places
public class LeftRotateArrayByDPlaces {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int d=3,n;
		n=arr.length;
//		Brute approach
		// TC : O(n+d)
		// SC : O(d)  -> we are using extra spaces i.e temp[]
		int temp[]=new int[d];
		for(int i=0; i<d; i++)
		{
			temp[i]=arr[i];
		}
		
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
		}
		
		for(int i=n-d; i<n; i++)
		{
			arr[i]=temp[i-(n-d)]; // 4-(4)=0 i.e arr[4]=temp[0]
		}
		System.out.println(Arrays.toString(arr));  // [4, 5, 6, 7, 1, 2, 3]	
	}
}
