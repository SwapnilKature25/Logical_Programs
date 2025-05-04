package com.nit.logical.arrays;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int []arr= {20,10,40,30,25};
		int temp=0;
		
		for(int i=0; i<arr.length ; i++)
		{
			for(int j=i+1; j<arr.length ; j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(arr[1]);
		
		System.out.println("Using stream");
		
		/// using stream
		Arrays.stream(arr).sorted().skip(arr.length-2).findFirst().ifPresent(System.out::println);
	
	}

}
