package com.nit.logical.arrays.stream;

import java.util.Arrays;

public class SumOfArrayUsingStreams {
	public static void main(String[] args) {
		int []arr= {10,20,30,40};
		int sum = Arrays.stream(arr).sum();
		System.out.println("Sum of array elements : "+sum);
	}
}
