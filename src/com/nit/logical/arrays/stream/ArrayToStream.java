package com.nit.logical.arrays.stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ArrayToStream {
	public static void main(String[] args) {
		int []arr= {10,15,30,35,50};
		IntStream stream1 = Arrays.stream(arr);
		stream1.forEach(num -> System.out.println(num));
		
		System.out.println("========================");
		
		long []arr2= {101,102,103,104};
		LongStream stream2 = Arrays.stream(arr2);
		stream2.forEach(num -> System.out.println(num));
		
		System.out.println("========================");
		double arr3[]= {1.2,13,1.4};
		DoubleStream stream = Arrays.stream(arr3);
		stream.forEach(System.out::println); 
	}
}
