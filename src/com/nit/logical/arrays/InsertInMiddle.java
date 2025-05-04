package com.nit.logical.arrays;

import java.util.Arrays;

class InsertAtMiddle
{
	public static int[] insertMiddle(int []arr,int newEle)
	{
		int newArray[]=new int[arr.length+1];  // 4+1 = 5
		int middle=arr.length/2;		// 2
		for(int i=0; i<middle; i++)   // i=0 , i<2, i++
		{
			newArray[i]=arr[i];   // n[0]=20 , n[1]=10
		}
		
		newArray[middle] = newEle;   // n[2]=7
		
		for(int i=middle; i<arr.length; i++)  // i=2, i<4, i++
		{
			newArray[i+1]=arr[i];  //n[2+1]=40 , n[3+1]=30
		}
		
		return newArray;
	}
}

public class InsertInMiddle {

	public static void main(String[] args) {
		int arr[]= {20,10,40,30};
		System.out.println("Original array : "+Arrays.toString(arr));
		
		int[] insertMiddle = InsertAtMiddle.insertMiddle(arr, 7);
		System.out.println("New array : "+Arrays.toString(insertMiddle));
		
	
	}

}
