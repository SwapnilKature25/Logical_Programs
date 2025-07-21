package com.nit.TrickyJavaStreamsIAQ;

import java.util.Arrays;
import java.util.Comparator;

// Find the nth smallest element in an array using java streams?
public class NthSmallestElement {

	public static void main(String[] args) {
		int arr[]= {12,3,5,7,19,1,8};
		int n=3; // nth smallest element (e.g 3rd smallest )
		
		Arrays.stream(arr)
			.sorted()
			.skip(n-1)
			.findFirst()
			.ifPresent(System.out::println);   // 5
	
//		3rd largest
		Arrays.stream(arr)
		.boxed()   // converts primitive type integers to stream of integers
		.sorted(Comparator.reverseOrder())
		.skip(n-1)
		.findFirst()
		.ifPresent(System.out::println);   // 8

	}
}
 