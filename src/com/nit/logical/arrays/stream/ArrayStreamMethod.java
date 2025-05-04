package com.nit.logical.arrays.stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
// to work with primitive type we have 3 specialized stream 
public class ArrayStreamMethod {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		IntStream stream1 = Arrays.stream(arr1);
		stream1.forEach(System.out::println);
	
		long arr2[]= {10,20,30,40};
		LongStream stream2 = Arrays.stream(arr2);
		stream2.forEach(System.out::println);
		
		double arr3[]= {1.0,3.0,4.0};
		DoubleStream stream3 = Arrays.stream(arr3);
		stream3.forEach(System.out::println);
		
	
	}
}
