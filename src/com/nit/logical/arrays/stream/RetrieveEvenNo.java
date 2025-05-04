package com.nit.logical.arrays.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RetrieveEvenNo {
	public static void main(String[] args) {
		int arr[]= {10,15,20,25,30};
		System.out.println("Original Stream : "+Arrays.toString(arr));
		
//		int[] array = Arrays.stream(arr).filter(num -> num%2==0).toArray();
//		System.out.println("Array with even no : "+Arrays.toString(array));  // [10, 20,30]
		IntStream array = Arrays.stream(arr).filter(num -> num%2==0);
		array.forEach(num -> System.out.print(num+" "));   // 10 20 30 
	}
}
