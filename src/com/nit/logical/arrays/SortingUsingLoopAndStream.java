package com.nit.logical.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortingUsingLoopAndStream {

	public static void main(String[] args) {
		int arr[]= {30,10,20,60,40,14};
		int temp=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		//  Stream 
		
		IntStream sorted = Arrays.stream(arr).distinct().sorted();
		sorted.forEach(System.out::println);
		
		
	}

}
