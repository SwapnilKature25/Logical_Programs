package com.nit.logical.arrays.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ArrayToPrimitiveStream {

	public static void main(String[] args) {
		int a1[]=new int[] {1,2,3};
		int a2[]=new int[] {11,22,33};
		int a3[]=new int[] {21,22,23};
		
		
		// IntStream
		List<int[]> nestedArray = Arrays.asList(a1,a2,a3);
		IntStream flatMapToInt = nestedArray.stream().flatMapToInt(num -> Arrays.stream(num));	
		int[] array = flatMapToInt.toArray();
		System.out.println(Arrays.toString(array));
	
		
		long arr1[]=new long[] {1,2,3};
		long arr2[]=new long[] {11,22,33};
		long arr3[]=new long[] {21,22,23};
		// LongStream
		List<long[]> longArray = Arrays.asList(arr1,arr2,arr3);
		LongStream flatMapToLong = longArray.stream().flatMapToLong(arr -> Arrays.stream(arr));
		long[] array2 = flatMapToLong.toArray();
		System.out.println(Arrays.toString(array2));
		
		
		double d1[]=new double[] {1.1,1.2,1.3};
		double d2[]=new double[] {2.1,2.2,2.3};
		double d3[]=new double[] {3.1,3.2,3.3};
		
		List<double[]> asList = Arrays.asList(d1,d2,d3);
		DoubleStream flatMapToDouble = asList.stream().flatMapToDouble(arry -> Arrays.stream(arry));
		double[] array3 = flatMapToDouble.toArray();
		System.out.println(Arrays.toString(array3));
	}

}
